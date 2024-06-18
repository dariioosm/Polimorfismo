package personalSanitario;

import java.io.Serializable;

public abstract class Sanitario implements Serializable {

	/*
	 * ORDEN
	 * SuperClass
	 * Fields
	 * Getters && Setters
	 * toString
	 */
	private String apellidoNombre;
	private String numeroRegistro;
	private int numeroTrienios;
	private String grupo;
	double[] trienios = { 45.29, 36.93, 32.41, 27.95, 19.02 };
	String[] codigos = { "A1/A", "A2/B", "B/-", "C1/C", "C2/D" };

	public abstract double calculoNomina();

	public Sanitario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sanitario(String apellidoNombre, String numeroRegistro, int numeroTrienios, String grupo) {
		super();
		this.apellidoNombre = apellidoNombre;
		this.numeroRegistro = numeroRegistro;
		this.numeroTrienios = numeroTrienios;
		this.grupo = grupo;
	}

	public String getApellidoNombre() {
		return apellidoNombre;
	}

	public void setApellidoNombre(String apellidoNombre) {
		this.apellidoNombre = apellidoNombre;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public int getNumeroTrienios() {
		return numeroTrienios;
	}

	public void setNumeroTrienios(int numeroTrienios) {
		this.numeroTrienios = numeroTrienios;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Sanitario || Nombre=" + apellidoNombre + ", ID=" + numeroRegistro
				+ ", N�mero de Trienios=" + numeroTrienios + ", Grupo=" + grupo + " || \n";
	}

}
