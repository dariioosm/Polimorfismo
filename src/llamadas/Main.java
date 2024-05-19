package llamadas;

import java.util.*;

public class Main {
    static LlamadaList llamada = new LlamadaList();

    public static void main(String[] args) {
        int opcion;
        Scanner in = new Scanner(System.in);
        llamada.cargar();
        do {
            mostrarMenu();
            opcion = in.nextInt();
            in.nextLine(); // Consume newline character

            switch (opcion) {
                case 1:
                    llamada.mostrar();
                    break;
                case 2:
                    llamada.calcFactura();
                    break;
                case 3:
                    llamada.guardarArrayList();
                    break;
                case 4:
                    llamada.cargarArrayList();
                    break;
                case 5:
                    llamada.eliminarLlamadasDestino();
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
        System.out.println("1. Mostrar todos los datos de cada llamada junto con su coste.");
        System.out.println("2. Calcular la factura telefónica.");
        System.out.println("3. Grabar las llamadas en un fichero.");
        System.out.println("4. Leer las llamadas grabadas en el fichero y visualizar solo las 'Horaria'.");
        System.out.println("5. Eliminar todas las llamadas realizadas a un determinado número de destino.");
        System.out.println("6. Salir.");
        System.out.print("Elige una opción: ");
    }
}
