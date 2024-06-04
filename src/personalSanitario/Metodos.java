package personalSanitario;

import java.util.*;
import java.io.*;


public class Metodos {
ArrayList<Sanitario> lista = new ArrayList <Sanitario>();
	ArrayList<Fichero> listaN= new ArrayList <Fichero>();	
	
	public void cargar() {
		lista.add(new Hospitalario("Pérez Carlos","RP11",5,"A1/A","H-Cabueñes"));
		lista.add(new Hospitalario("Pérez Maria","RP13",3,"C1/C","H-SanAgustin"));
		lista.add(new Hospitalario("Lago Carlos","RP17",2,"C2/D","H-Cabueñes"));
		lista.add(new Hospitalario("Vega Paula","RP18",5,"A1/A","H-HUCA"));
	
		}

	public void mostrarInfo() {
		System.out.println("NUMERO REGISTRO || APELLIDOS/NOMBRE || NOMINA");
		for(Sanitario ss: lista) {
			System.out.println(ss.getNumeroRegistro()+" || "+ss.getApellidoNombre()+" || "+ss.calculoNomina());	
			}		
	}

	public void Eliminar() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Eliminar Sanitarios por Hospital:");
	    System.out.println("Introduce Hospital:");
	    String hospitalN = sc.nextLine();

	    boolean eliminado = false;
	    Iterator<Sanitario> it = lista.iterator();
	    while (it.hasNext()) {
	        Sanitario s = it.next();
	        if (s instanceof Hospitalario) {
	            Hospitalario h = (Hospitalario) s;
	            if (hospitalN.equals(h.getHospital())) {
	                it.remove();
	                System.out.println("Eliminado con éxito: " + h.toString());
	                eliminado = true;
	            }
	        }
	    }

	    if (!eliminado) {
	        System.out.println("No se encontraron sanitarios del hospital " + hospitalN);
	    }
	}
	 

	public void guardarFichero() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileOutputStream fichero = null;
		Fichero f = new Fichero();
		Hospitalario h= new Hospitalario();
		for(Sanitario li: lista) {
		listaN.add(new Fichero(li.getNumeroRegistro(),li.calculoNomina()));
		}
		for(Fichero li: listaN) {
			System.out.println(li.toString());
			}
		try {
			fichero = new FileOutputStream("Hospital.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fichero);
			oos.writeObject(this.listaN);
			System.out.println("Fichero guardado.");
			System.out.println();
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				fichero.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}	

	public void leerFichero() {
		try {
			FileInputStream fin = new FileInputStream("Hospital.dat");
			ObjectInputStream ois = new ObjectInputStream(fin);
			listaN= (ArrayList<Fichero>)ois.readObject();
			ois.close();
			DecimalFormat df = new DecimalFormat("#.00");
			Fichero f = new Fichero();
			for(Fichero li: listaN) {
				System.out.println("leeyendo");
					System.out.println(li.toString());
				}
			
			}catch(ClassNotFoundException cnfe) {
				System.out.println("No se pudo acceder a la clase adecuada para revertirlo.");
			}catch(FileNotFoundException fnfe) {
				System.out.println("Error: el fichero no existe.");
			}catch(IOException ioe) {
				System.out.println(ioe.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	
	public void Nomina() {		
		double totalBeneficios = 0;
		Hospitalario h= new Hospitalario();
		for(Sanitario ll: lista) {
				//System.out.println("CODIGO || " +ll. + " ||  Suma Correspondiente: "+ll.lista+"€ || Salario Final: "+ll.calculoNomina()+"€");
			System.out.println(ll.toString()+"Salario Final: "+ll.calculoNomina()+"€");	
			System.out.println();
					} 
					}
}
