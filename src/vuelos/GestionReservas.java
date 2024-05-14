package vuelos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionReservas {
	
	ArrayList<Reserva> res = new ArrayList<Reserva>();

	public GestionReservas() {
		super();
	}
	
	public void cargarReservas() {
		res.add(new ReservaHotel("Juan Alberto", 6, 59.99, 17, "Hotel 33K", "Leon"));
		res.add(new ReservaHotel("Alfredo", 8, 49.99, 2, "Hotel NH", "Murcia"));
		res.add(new ReservaHotel("Jose Luis", 10, 54.99, 3, "PLA Hotel", "Asturias"));
		res.add(new ReservaVuelo("Paco", 13, 79.99, 1, "Madrid", "Barcelona"));
		res.add(new ReservaVuelo("Manolo", 19, 50.99, 4, "Valencia", "Asturias"));
	}
	
	public void agregarReserva() {
		int[] adias = {6,8,10,13,16,19};
		boolean compDias = false;
		String nombre;
		double precio;
		int dias, personas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del cliente");
		nombre = sc.next();
		do {
			System.out.println("Introduce el numero de dias");
			dias = sc.nextInt();
			for(int i = 0; i < adias.length; i++) {
				if(dias == adias[i]) 
					compDias = true;
			}
			if(!compDias) {
				System.out.println("Error, el numero de dias no es valido, elige uno de esta lista: 6, 8, 10, 13, 16, 19");
			}
		}while(!compDias);
		System.out.println("Introduce el precio base");
		precio = sc.nextDouble();
		System.out.println("Introduce el numero de personas");
		personas = sc.nextInt();
		System.out.println("¿Se trata de un hotel (1) o un vuelo (2)?");
		int o = sc.nextInt();
		while(o != 1 && o != 2) {
			System.out.println("Opcion no valida. ¿Se trata de un hotel (1) o un vuelo (2)?");
			o = sc.nextInt();
		}
		
		if(o == 1) {
			System.out.println("Introduce el nombre del hotel");
			String hotel = sc.next();
			sc.nextLine();
			System.out.println("Introduce la ubicacion del hotel");
			String ubi = sc.next();
			res.add(new ReservaHotel(nombre, dias, precio, personas, hotel, ubi));
		} else {
			System.out.println("Introduce el origen del vuelo");
			String origen = sc.next();
			System.out.println("Introduce el destino del vuelo");
			String destino = sc.next();
			res.add(new ReservaHotel(nombre, dias, precio, personas, origen, destino));
		}
	}
	
	public void buscarReserva() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nombre de cliente: ");
		String nombre = sc.next();
		for(Reserva r: res) {
			if(r.getNombreCliente().equals(nombre)) {
				if(r instanceof ReservaHotel)
					System.out.println(((ReservaHotel) r).toString());
				else
					System.out.println(((ReservaVuelo) r).toString());
			}
		}
	}
	
	public void grabarReservas() throws FileNotFoundException, IOException {
		ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("Reservas.dat"));
		try {
			
				salida.writeObject(res);
			
		}catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch(IOException ex) {
			System.out.println("Fin del fichero");
		}finally {
			try {
				salida.close();
			}catch(IOException ex) {
				System.out.println("Error al cerrar el fichero");
			}
		}
	}
	
	public void leerReservas() throws FileNotFoundException, IOException, ClassNotFoundException {
		int[] numeroDias = {6,8,10,13,16,19};
		double[] descuentos = {0.11, 0.15, 0.22, 0.31, 0.35};
		ArrayList<Reserva> reservas = new ArrayList<Reserva>();
        ObjectInputStream fent = new ObjectInputStream(new FileInputStream("Reservas.dat"));
        try {
        	reservas = (ArrayList) fent.readObject();
            fent.close();
            for (Reserva r: reservas) {  
  	          System.out.println (r.toString()); 
  	        double precioTotal = r.getPrecioBase() * r.getNumeroPersonas() * r.getNumeroDias();
	          for(int i = 0; i < numeroDias.length-1; i++) {
				if(r.getNumeroDias() == numeroDias[i])
					precioTotal -= (precioTotal * descuentos[i]);
			}
			System.out.println("Precio total del cliente: " + precioTotal);
            }
        }catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch(IOException ex) {
			System.out.println("Fin del fichero");
		}finally {
			try {
				fent.close();
			}catch(IOException ex) {
				System.out.println("Error al cerrar el fichero");
			}
		}
	}

}
