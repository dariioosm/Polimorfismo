package ejercicioFinalMayo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ElectrodomesticoAL lista = new ElectrodomesticoAL();
        lista.cargaLista();
        int opcion;
        Scanner in = new Scanner(System.in);
        do {
            mostrarMenu();
            opcion = in.nextInt();
            in.nextLine(); // Consume newline character

            switch (opcion) {
                case 1:
                    lista.mostrarArrayList();
                    break;
                case 2:
                    lista.annadirProducto();
                    break;
                case 3:
                    lista.grabaFichero();
                    break;
                case 4:
                    lista.leeFichero();
                    break;
                case 5:
                    lista.totalPorProductos();
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Visualizar el inventario.");
        System.out.println("2. Agrega productos al inventario.");
        System.out.println("3. Grabar los productos en un fichero.");
        System.out.println("4. Leer los productos grabados en el fichero");
        System.out.println("5. Ver dinero ingresado por tipo de producto");
        System.out.println("6. Salir.");
        System.out.print("Elige una opción: ");
    }
}
