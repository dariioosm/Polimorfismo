package personalSanitario;

public class Hospitalario extends Sanitario {
	private String hospital;

	public Hospitalario() {
		// TODO Auto-generated constructor stub
	}

	public Hospitalario(String apellidoNombre, String numeroRegistro, int numeroTrienios, String grupo,
			String hospital) {
		super(apellidoNombre, numeroRegistro, numeroTrienios, grupo);
		this.hospital = hospital;
	}

	@Override
	public double calculoNomina() {
		double[] trienios = { 45.29, 36.93, 32.41, 27.95, 19.02 };
		String[] codigos = { "A1/A", "A2/B", "B/-", "C1/C", "C2/D" };

		/*
		 * Hospitalario: 1.700 al mes, m�s el importe de los trienios (n�mero trienios x
		 * trienio (en funci�n del grupo).
		 */
		double beneficio = 0;
		for (int i = 0; i < trienios.length; i++) {
			if (this.getGrupo().equals(codigos[i])) {
				beneficio = 1700 + (trienios[i] * getNumeroTrienios());
			}
		}
		return beneficio;

	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return super.toString() + "Hospitalario --> Hospital=" + hospital + "\n";
	}
}