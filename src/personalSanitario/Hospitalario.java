package personalSanitario;

import java.io.*;

public class Hospitalario extends Sanitario implements Serializable {
	private String hospital;

	public Hospitalario(String apellidoNombre, String numeroRegistro, int numeroTrienios, String grupo,
			String hospital) {
		super(apellidoNombre, numeroRegistro, numeroTrienios, grupo);
		this.hospital = hospital;
	}

	public Hospitalario() {
		//TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "Hospitalario [hospital=" + hospital + "]";
	}

	public String getHostipal() {
		return hospital;
	}

	public void setHostipal(String hostipal) {
		this.hospital = hospital;
	}

	@Override
	public double calculoNomina() {
		double nomina = 1700;
		double nominaF = 0;
		String[] prima = { "A1/A", "A2/B", "B/-", "C1/C", "C2/D" };
		double[] dinero = { 45.29, 36.93, 32.41, 27.95, 19.02 };
		for (int i = 0; i < prima.length; i++) {
			if (this.getGrupo().equals(prima[i])) {
				nominaF = nomina + (dinero[i] * getNumeroTrienios());
			}
		}
		return nominaF;
	}


}
