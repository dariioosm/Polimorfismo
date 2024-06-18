package personalSanitario;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Metodos obj = new Metodos();
		Scanner in = new Scanner(System.in);
		int resp = 0;
		obj.cargar();

		try {
			do {
				System.out.println("MENU");
				System.out.println();
				System.out.println("1) Mostrar Informaci�n");
				System.out.println("2) Eliminar Sanitarios (Por Hospital)");
				System.out.println("3) Guardar Fichero");
				System.out.println("4) Calcular Nomina Mensual");
				System.out.println("5) Leer Fichero");
				System.out.println("6) Salir del programa");
				System.out.print("Opcion: ");
				resp = in.nextInt();
				in.nextLine();
				System.out.println();

				switch (resp) {
					case 1:
						obj.mostrarInfo();
						break;
					case 2:
						obj.Eliminar();
						break;
					case 3:
						obj.guardarFichero();
						break;
					case 4:
						obj.Nomina();
						break;
					case 5:
						obj.leerFichero();
						break;
					case 6:
						System.out.println("Finalizando programa...");
						break;
					default:
						System.out.println("Opcion introducida invalida, por favor vuelta a intentarlo");
						System.out.println();
						break;
				}
			} while (resp != 6);
		} catch (FileNotFoundException ex) {
			System.out.println();
			System.out.println("Error: (FileNotFoundException) " + ex.getMessage());
			System.out.println();
		} catch (IOException ex) {
			System.out.println();
			System.out.println("Error: (IOException) " + ex.getMessage());
			System.out.println();
		} catch (ClassNotFoundException ex) {
			System.out.println();
			System.out.println("Error: (ClassNotFoundException) " + ex.getMessage());
			System.out.println();
		} catch (Exception ex) {
			System.out.println();
			System.out.println("Error: (Exception) " + ex.getMessage());
			System.out.println();
		}

	}

}