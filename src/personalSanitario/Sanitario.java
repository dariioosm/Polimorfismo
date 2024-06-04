package personalSanitario;

import java.io.*;

public abstract class Sanitario implements Serializable {
	protected String apellidoNombre;
	protected String numeroRegistro;
	protected int numeroTrienios;
	protected String grupo;

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

	@Override
	public String toString() {
		return "Sanitario [apellidoNombre=" + apellidoNombre + ", numeroRegistro=" + numeroRegistro
				+ ", numeroTrienios="
				+ numeroTrienios + ", grupo=" + grupo + "]";
	}

	public abstract double calculoNomina();

}
