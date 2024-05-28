package ejercicioFinalMayo;

import java.io.*;
import java.util.*;

public class ElectrodomesticoAL {
    public char[] CONSUMOS_VALIDOS = { 'A', 'B', 'C', 'D', 'E', 'F' };
    public String[] COLORES_VALIDOS = { "blanco", "negro", "rojo", "azul", "gris" };
    ArrayList<Electrodomestico> ventas = new ArrayList<Electrodomestico>();

    public void cargaLista() {
        ventas.add(new Television(500, 10, 'E', "negro", 42, false));
        ventas.add(new Television(200, 20, 'C', "naranja", 30, true));
        ventas.add(new Lavadora(600, 20, 'D', "gris", 10));
        ventas.add(new Lavadora(300, 40, 'Z', "blanco", 40));
        ventas.add(new Lavadora(400, 60, 'A', "verde", 15));
    }

    public void mostrarArrayList() {
        for (Electrodomestico registro : ventas) {
            System.out.println(registro);
        }
    }

    private boolean esConsumoValido(char letra) {
        letra = Character.toUpperCase(letra);
        for (char c : CONSUMOS_VALIDOS) {
            if (c == letra) {
                return true;
            }
        }
        return false;
    }

    private boolean esColorValido(String color) {
        for (String c : COLORES_VALIDOS) {
            if (c.equalsIgnoreCase(color)) {
                return true;
            }
        }
        return false;
    }

    public void annadirProducto() {
        Scanner in = new Scanner(System.in);
        char continua;
        char letra;
        String color;
        int op;
        do {

            System.out.print("Introduzca precio base del producto: ");
            double precioBase = in.nextDouble();

            System.out.print("Introduce el peso del producto: ");
            int peso = in.nextInt();
            in.nextLine();// limpia bufer

            do {
                System.out.print("Introduce el consumo del producto (A-F): ");
                letra = in.nextLine().charAt(0);
                if (!esConsumoValido(letra)) {
                    System.out.println("Consumo no válido. Debe estar entre A y F.");
                }
            } while (!esConsumoValido(letra));

            do {
                System.out.print("Introduzca el color del producto: ");
                color = in.nextLine();
                if (!esColorValido(color)) {
                    System.out.println("Color no válido. Debe ser uno de: blanco, negro, rojo, azul, gris.");
                }
            } while (!esColorValido(color));
            System.out.println("Introduce una opcion valida, Television 1  o 2 Lavadora");
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Introduce el numero de pulgadas de la TV");
                    int resolucion = in.nextInt();
                    System.out.println("Escribe smart para indicar si es smart o no, si no lo es");
                    String smart = in.nextLine();
                    boolean smartTv = in.nextLine().equalsIgnoreCase("smart");
                    ventas.add(new Television(precioBase, peso, letra, color, resolucion, false));
                    break;

                case 2:
                    System.out.println("Introduce carga de la lavadora en kg");
                    int carga = in.nextInt();
                    ventas.add(new Lavadora(precioBase, peso, letra, color, carga));
                    break;
            }
            System.out.println("Desea continuar(S/N)");
            continua = in.next().charAt(0);

        } while (continua == 'S' || continua == 's');
    }

    public void grabaFichero() throws FileNotFoundException, IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Productos.dat"));
        try {
            salida.writeObject(ventas);
            salida.close();
            System.out.println("Producto guardado correctamente");
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error en entrada o salida de datos");
        }
    }

    public void leeFichero() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Productos.dat"))) {
            ventas = (ArrayList<Electrodomestico>) entrada.readObject();
            for (Electrodomestico electrodomestico : ventas) {
                System.out.println(electrodomestico);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encuentra la clase");
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error en entrada o salida de datos");
        }
    }
    // para diferenciar el tipo de producto para sacar el monto total tengo que
    // hacer un instanceof que llame
    // a la clase television o lavadora usando un if (deberia funcinar solo con un
    // for each)

    public void beneficios() {

    }

}
