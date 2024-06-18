package personalSanitario;

import java.io.Serializable;

public class Fichero extends Sanitario implements Serializable {

	private String numeroRegistro;
	private double calculoNomina;

	public Fichero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fichero(String numeroRegistro, double calculoNomina) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.calculoNomina = calculoNomina;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public double getCalculoNomina() {
		return calculoNomina;
	}

	public void setCalculoNomina(double calculoNomina) {
		this.calculoNomina = calculoNomina;
	}

	public double calculoNomina() {
		double[] trienios = { 45.29, 36.93, 32.41, 27.95, 19.02 };
		String[] codigos = { "A1/A", "A2/B", "B/-", "C1/C", "C2/D" };
		Hospitalario h = new Hospitalario();
		/*
		 * Hospitalario: 1.700 al mes, m�s el importe de los trienios (n�mero trienios x
		 * trienio (en funci�n del grupo).
		 */
		double beneficio = 0;
		for (int i = 0; i < trienios.length; i++) {
			if (h.getGrupo().equals(codigos[i])) {
				beneficio = 1700 + (trienios[i] * h.getNumeroTrienios());
			}
		}
		return beneficio;

	}

	@Override
	public String toString() {
		return "Fichero [numeroRegistro=" + numeroRegistro + ", calculoNomina=" + calculoNomina + "]";
	}

}
