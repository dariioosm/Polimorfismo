package vuelos;
import java.io.*;
import java.util.Scanner;
public class MainReservas {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		GestionReservas r = new GestionReservas();
		char cont;
		
		r.cargarReservas();
		
		do {
			int o = menu();
		
			switch(o) {
			case 1:
				r.agregarReserva();
				break;
			case 2:
				r.buscarReserva();
				break;
			case 3:
				r.grabarReservas();
				break;
			case 4:
				r.leerReservas();
				break;
			default:
				System.out.println("Esa opcion no es válida");
			}
			
			System.out.println("¿Continuar? (S/N)");
			cont = sc.next().charAt(0);
			cont = Character.toUpperCase(cont);
		
		}while(cont == 'S');

	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una opcion:"
				+"\n1. Añadir Reservas."
				+"\n2. Buscar Reservas."
				+"\n3. Grabar Reservas."
				+"\n4. Leer Reservas.");
		int o = sc.nextInt();
		return o;
	}

}
