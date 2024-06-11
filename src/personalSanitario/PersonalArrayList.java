package personalSanitario;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class PersonalArrayList {
	ArrayList<Sanitario> plantilla = new ArrayList<Sanitario>();
	ArrayList<FicheroNuevo> plantilla2 = new ArrayList<FicheroNuevo>();

	public String[] trienios_validos = { "A1/A", "A2/B", "B/-", "C1/C", "C2/D" };

	public void cargarLista() {
		plantilla.add(new Hospitalario("Pérez Carlos", "RP11", 5, "A1/A", "H-Cabueñes"));
		plantilla.add(new Hospitalario("Pérez Maria", "RP13", 3, "C1/C", "H-SanAgustin"));
		plantilla.add(new Hospitalario("Lago Carlos", "RP17", 2, "C2/D", "H-Cabueñes"));
		plantilla.add(new Hospitalario("Vega Paula", "RP18", 5, "A1/A", "H-HUCA"));
	}

	public void mostrarArrayList() {
		for (Sanitario registro : plantilla) {
			System.out.println(registro);
		}
	}

	public void borraSanitario() {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce codigo de hospital: ");
		String codigo = in.nextLine();
		char op;
		boolean encontrado = false;
		System.out.println();
		for (Sanitario persona : plantilla) {
			if (codigo.equals(((Hospitalario) persona).getHostipal())) {
				encontrado = true;
				System.out.println("Desea borrar el articulo con el codigo " + codigo + "? (s/n)");
				op = in.next().charAt(0);
				if (op == 's' || op == 'S') {
					plantilla.remove(persona);
					System.out.println("Personal eliminado correctamente.");
				}
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Personal de hospital borrado.");
		}
	}

	private boolean esTriendioValido(String numeroTrienio) {
		for (String tri : trienios_validos) {
			if (tri.contentEquals(numeroTrienio)) {
				return true;
			}
		}
		return false;
	}

	public void grabaFichero() {
		FileOutputStream fichero = null;
		FicheroNuevo f = new FicheroNuevo();
		Hospitalario h = new Hospitalario();
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Personal.dat"));
			ObjectOutputStream oos = new ObjectOutputStream(fichero);
			oos.writeObject(this.plantilla2);
			System.out.println("Fichero guardado.");
			System.out.println();
		} catch (FileNotFoundException ex) {
			System.out.println("fichero no encontrado" + ex);
		} catch (IOException ex) {
			System.out.println("error en entrada o salida de datos" + ex);
		} finally {
			try {
				fichero.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public void leeFichero() {
		try {
			FileInputStream fin = new FileInputStream("Hospital.dat");
			ObjectInputStream ois = new ObjectInputStream(fin);
			plantilla2 = (ArrayList<FicheroNuevo>) ois.readObject();
			ois.close();
			DecimalFormat df = new DecimalFormat("#.00");
			FicheroNuevo f = new FicheroNuevo();
			for (FicheroNuevo li : plantilla2) {
				System.out.println("leyendo");
				System.out.println(li.toString());
			}

		} catch (ClassNotFoundException cnfe) {
			System.out.println("No se pudo acceder a la clase adecuada para revertirlo." + cnfe);
		} catch (FileNotFoundException fnfe) {
			System.out.println("Error: el fichero no existe." + fnfe);
		} catch (IOException ioe) {
			System.out.println("Error: en entrada o salida." + ioe);
		}
	}

}
