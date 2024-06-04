package personalSanitario;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		PersonalArrayList persona= new PersonalArrayList();
		persona.cargarLista();
		 int opcion;
	        Scanner in = new Scanner(System.in);
	        do {
	            mostrarMenu();
	            opcion = in.nextInt();
	            in.nextLine(); // Consume newline character

	            switch (opcion) {
	                case 1:
	                    persona.mostrarArrayList();
	                    break;
	                case 2:
	                    persona.borraSanitario();
	                    break;
	                case 3:
	                    persona.grabaFichero();
	                    break;
	                case 4:
	                    persona.leeFichero();
	                    break;
	                case 5:
	                    System.out.println("Saliendo del programa");
	                    break;
	                default:
	                    System.out.println("Opción inválida. Inténtalo de nuevo.");
	            }
	        } while (opcion != 5);
		
	}
	private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Visualizar el persional.");
        System.out.println("2. Borrar persona utilizando nombre de hospital.");
        System.out.println("3. Grabar los productos en un fichero.");
        System.out.println("4. Leer los productos grabados en el fichero");
        System.out.println("5. Salir.");
        System.out.print("Elige una opción: ");
    }
}
