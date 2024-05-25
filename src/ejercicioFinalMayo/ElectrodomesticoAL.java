package ejercicioFinalMayo;

import java.io.*;
import java.util.*;

public class ElectrodomesticoAL {
    ArrayList<Electrodomestico> ventas = new ArrayList<Electrodomestico>();

    public void cargaLista() {
        ventas.add(new Television(500, 10, 'E', "negro", 42, false));
        ventas.add(new Television(200, 20, 'C', "naranja", 30, true));
        ventas.add(new Lavadora(600, 20, 'D', "gris", 10));
        ventas.add(new Lavadora(300, 40, 'Z', "blanco", 40));
        ventas.add(new Lavadora(400, 60, 'A', "verde", 15));
    }

    public void mostrarArrayList() {
        for (Electrodomestico electrodomestico : ventas) {
            System.out.println(electrodomestico);
        }
    }

    public void annadirProducto() {
        Scanner in = new Scanner(System.in);
        char continua;
        do {
            System.out.println("Introduzca precio base del producto");
            double precioBase = in.nextDouble();
            System.out.println("Introduce el peso del producto");
            int peso = in.nextInt();
            System.out.println("Introduce el consumo del producto A-F");
            char letra = in.next().charAt(0);
            System.out.println("Introduzca el color del producto");
            String color = in.nextLine();
            color = in.nextLine();
            System.out.println("Es una television (1) o una lavadora (2)");
            int op = in.nextInt();
            while (op != 1 && op != 2) {
                System.out.println("Introduce una opcion valida, 1 o 2");
            }
            switch (op) {
                case 1:
                    System.out.println("Introduce el numero de pulgadas de la TV");
                    int resolucion = in.nextInt();
                    System.out.println("Indique si es SmartTv o no (smart)");
                    String smart = in.nextLine();
                    if (smart.equalsIgnoreCase("smart")) {
                        boolean smartTv = true;
                    } else {
                        boolean smartTv = false;
                    }
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

}
