package personalSanitario;

import java.io.*;
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
				if (op == 's') {
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
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Personal.dat"))) {

			salida.writeObject(plantilla);
			salida.close();

			System.out.println("Personal guardado exitosamente en personal.dat");
		} catch (IOException e) {
			System.out.println("Error al grabar en productos.dat: " + e.getMessage());
		}
	}

	public void leeFichero() {
		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Personal.dat"))) {
			plantilla2 = (ArrayList<Sanitario>) entrada.readObject();
			for (Sanitario persona : plantilla2) {
				Hospitalario hosp = (Hospitalario) persona;
				System.out.println("Numero de registro " + hosp.getNumeroRegistro() + " Salario Final con trienios "
						+ hosp.calculoNomina());
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
