package ventas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
        VentaArrayList var = new VentaArrayList();
        var.rellenaList();
        int opcion;
        Scanner in = new Scanner(System.in);
        do {
            mostrarMenu();
            opcion = in.nextInt();
            in.nextLine(); // Consume newline character

            switch (opcion) {
                case 1:
                    var.cargaLista();
                    break;
                case 2:
                    var.calculaVentas();
                    break;
                case 3:
                    var.borraVenta();
                    break;
                case 4:
                    var.grabaFichero();
                    break;
                case 5:
                    var.leerFichero();
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Visualizar el registro de ventas.");
        System.out.println("2. Visualizar ingresos por evento.");
        System.out.println("3. Borrar persona utilizando nombre de evento.");
        System.out.println("4. Grabar los productos en un fichero.");
        System.out.println("5. Leer los productos grabados en el fichero");
        System.out.println("6. Salir.");
        System.out.print("Elige una opción: ");
    }
}
