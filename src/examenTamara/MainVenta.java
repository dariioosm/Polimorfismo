package examenTamara;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainVenta {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        cargar(ventas);// lo cargamos antes porque necesitamos tener el ArrayList cargado para poder
                       // realizar los dem�s m�todoss
        int opc = menu();
        do {
            switch (opc) {
                case 1:
                    grabarFichero(ventas);
                    break;
                case 2:
                    anyadirVenta(ventas);
                    grabarFichero(ventas);
                    break;
                case 3:
                    buscarVenta(ventas);
                    break;
                case 4:
                    leerFichero(ventas);
                    break;
                case 5:
                    ventasPorVendedor(ventas);
                    break;
            }
            System.out.println();
            opc = menu();
        } while (opc != 6);

        System.out.println("FIN PROGRAMA");
    }

    public static void cargar(ArrayList<Venta> ventas) {
        ventas.add(new VentaOnline("Z1", 20, 5, "Zara", "Mastercard", "Madrid"));
        ventas.add(new VentaOnline("A2", 50, 2, "Adidas", "PayPal", "Valencia"));
        ventas.add(new VentaOnline("N3", 100, 1, "Nike", "PayPal", "Barcelona"));
        ventas.add(new VentaLocal("G4", 10, 3, "GAP", "Ana", "Oviedo"));
        ventas.add(new VentaLocal("N5", 200, 10, "Nike", "Roberto", "Oviedo"));
        ventas.add(new VentaLocal("H6", 15, 5, "H&M", "Roberto", "Oviedo"));
    }// CARGAR ARRAYLIST

    public static void grabarFichero(ArrayList<Venta> ventas) {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("ventas.dat"));
            salida.writeObject(ventas);
            salida.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la grabaci�n del fichero");
        } finally {
            System.out.println("Fichero grabado");
        }
    }// GRABAR

    public static void leerFichero(ArrayList<Venta> ventas) {

        double beneficio = 0;
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("ventas.dat"));
            entrada.close();
            System.out.println("CONTENIDO DEL FICHERO");
            for (Venta v : ventas) {
                if (v instanceof VentaOnline) {
                    beneficio = ((VentaOnline) v).calcularBeneficio();
                    System.out.println(v.toString());
                    System.out.println("Beneficio de la venta: " + beneficio + "�");
                } else {
                    beneficio = ((VentaLocal) v).calcularBeneficio();
                    System.out.println(v.toString());
                    System.out.println("Beneficio de la venta: " + beneficio + "�");
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero");
        } finally {
            System.out.println("Fin de la lectura del fichero");
        }
    }// LEER Y CALCULAR BENEFICIO

    public static void anyadirVenta(ArrayList<Venta> ventas) {
        Scanner sc = new Scanner(System.in);
        String[] marcasRopa = { "Nike", "Adidas", "Zara", "H&M", "GAP" };
        System.out.println("Introduce el c�digo de la venta a a�adir");
        String cod = sc.nextLine();
        int comprobac = comprobarExiste(cod, ventas);

        while (comprobac != -1) {
            System.out.println("ERROR: C�digo ya utilizado");
            System.out.println("Introduce el c�digo de la venta a a�adir");
            cod = sc.nextLine();
            comprobac = comprobarExiste(cod, ventas);
        } // validar idProducto

        sc.nextLine();
        System.out.println("Introduce el precio del producto");
        double prec = sc.nextDouble();

        while (prec <= 0) {
            System.out.println("ERROR: Dato no v�lido");
            System.out.println("Introduce el precio del producto");
            prec = sc.nextDouble();
        } // validar precio

        System.out.println("Introduce la cantidad vendida");
        int cant = sc.nextInt();
        while (cant <= 0) {
            System.out.println("ERROR: Dato no v�lido");
            System.out.println("Introduce la cantidad vendida");
            prec = sc.nextDouble();
        } // validar cantidad

        sc.nextLine();

        System.out.println("Introduce la marca");
        String marca = sc.nextLine();

        boolean comprobar = false;
        for (int i = 0; i < marcasRopa.length; i++) {

            if (marcasRopa[i].equalsIgnoreCase(marca)) {
                comprobar = true;

            }

        }

        while (comprobar == false) {
            System.out.println("ERROR: Dato no v�lido");
            System.out.println("Introduce la marca");
            marca = sc.nextLine();
            for (int i = 0; i < marcasRopa.length; i++) {

                if (marcasRopa[i].equalsIgnoreCase(marca)) {
                    comprobar = true;

                }

            }
        } // validar marca

        sc.nextLine();

        System.out.println("Introduce el tipo de venta: O para online o L para local");
        char tipo = sc.next().charAt(0);
        tipo = Character.toUpperCase(tipo);

        while ((tipo != 'O') && (tipo != 'L')) {
            System.out.println("ERROR: Dato no v�lido");
            System.out.println("Introduce el tipo de venta: O para online o L para local");
            tipo = sc.next().charAt(0);
            tipo = Character.toUpperCase(tipo);
        }

        switch (tipo) {
            case 'O':
                System.out.println("Introduce el m�todo de pago");
                String mPago = sc.nextLine();
                sc.nextLine();
                System.out.println("Introduce la direcci�n de env�o");
                String dir = sc.nextLine();
                ventas.add(new VentaOnline(cod, prec, cant, marca, mPago, dir));
                System.out.println("Venta a�adida");
                break;
            case 'L':
                sc.nextLine();
                System.out.println("Introduce el vendedor");
                String vend = sc.nextLine();
                sc.nextLine();
                System.out.println("Introduce la direcci�n de env�o");
                String dire = sc.nextLine();
                ventas.add(new VentaLocal(cod, prec, cant, marca, vend, dire));
                System.out.println("Venta a�adida");
                break;
        }// switch

    }// A�ADIR UNA VENTA

    public static int comprobarExiste(String cod, ArrayList<Venta> ventas) {
        int posic = -1;
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getIdProducto().equals(cod)) {
                posic = i;
            }
        }
        return posic;
    }// comprobar si ya existe el c�digo del producto

    public static void buscarVenta(ArrayList<Venta> ventas) {
        Scanner sc = new Scanner(System.in);
        char resp = 'S';
        do {
            System.out.println("Introduce el ID de la venta que quieres consultar");
            String id = sc.nextLine();

            int comprobac = comprobarExiste(id, ventas);

            while (comprobac == -1) {
                System.out.println("ERROR: Id no encontrado");
                System.out.println("Introduce el ID de la venta que quieres consultar");
                id = sc.nextLine();
                comprobac = comprobarExiste(id, ventas);
            }
            System.out.println("DATOS DE LA B�SQUEDA");
            System.out.println(ventas.get(comprobac).toString());

            System.out.println("�Otra b�squeda? S/N");
            resp = sc.next().charAt(0);
            resp = Character.toUpperCase(resp);

            while ((resp != 'S') && (resp != 'N')) {
                System.out.println("ERROR: Dato no v�lida");
                resp = sc.next().charAt(0);
                resp = Character.toUpperCase(resp);
            }
            sc.nextLine();

        } while (resp != 'N');
    }// BUSCAR VENTA

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tMEN�");
        System.out.println("1.- Grabar datos en un fichero");
        System.out.println("2.- A�adir Venta");
        System.out.println("3.- Buscar Venta");
        System.out.println("4.- Informe de ventas");
        System.out.println("5.- Calcular total");
        System.out.println("6.- Salir");
        System.out.println();
        System.out.println("Elige una opci�n:");
        int op = sc.nextInt();

        while ((op < 1) || (op > 6)) {
            System.out.println("ERROR: Dato no v�lido");
            System.out.println("Elige una opci�n:");
            op = sc.nextInt();
        }

        return op;

    }// MEN�

    public static void ventasPorVendedor(ArrayList<Venta> ventas) {
        int total;
        for (Venta v : ventas) {
            if (v instanceof VentaLocal) {
                total = ((VentaLocal) v).calcularTotalVentas(ventas);
                System.out.println(
                        "Vendedor: " + ((VentaLocal) v).getVendedor() + " || Total de productos vendidos: " + total);
            }
        }

    }

}
