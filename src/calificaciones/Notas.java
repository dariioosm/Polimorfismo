package calificaciones;

public class Notas {

	public static void main(String[] args) {

		Notas nota = new Notas();
		String[] titulos = new String[] { "ALUMNO", "PRACTICA", "PROBLEMAS", "TEORIA" };
		String[] alumnos = new String[] { "AAA AAA", "BBB BBB", "CCC CCC", "FFF FFF", "JJJ JJJ" };
		double[][] notas = new double[][] {
				{ 2, 7, 4 },
				{ 1, 2, 3 },
				{ 1, 9, 4 },
				{ 3, 5, 8 },
				{ 7, 5, 3 } };

		nota.mostrarMatriz(titulos, alumnos, notas);
		double[][] notasCalculadas = nota.calcularNotas(notas);
		nota.verNotas(alumnos, notasCalculadas);
	}

	public static void mostrarMatriz(String[] titulos, String[] alumnos, double[][] notas) {
		for (String titulo : titulos) {
			System.out.print(titulo + "\t");
		}
		System.out.println();
		for (int i = 0; i < alumnos.length; i++) {
			System.out.print(alumnos[i] + "\t");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + "    " + "\t\t");
			}
			System.out.println();
		}
	}

	public double[][] calcularNotas(double[][] notas) {
		double[][] notasCalculadas = new double[notas.length][4];

		for (int i = 0; i < notas.length; i++) {
			double notaPra = notas[i][0] * 0.1;
			double notaPro = notas[i][1] * 0.5;
			double notaT = notas[i][2] * 0.4;
			double notaFinal = notaPra + notaPro + notaT;

			notasCalculadas[i][0] = notaPra;
			notasCalculadas[i][1] = notaPro;
			notasCalculadas[i][2] = notaT;
			notasCalculadas[i][3] = notaFinal;
		}

		return notasCalculadas;
	}

	public void verNotas(String[] alumnos, double[][] notasCalculadas) {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("\nAlumno: " + alumnos[i]);
			System.out.println("Nota práctica: " + notasCalculadas[i][0]);
			System.out.println("Nota problemas: " + notasCalculadas[i][1]);
			System.out.println("Nota teoría: " + notasCalculadas[i][2]);
			System.out.println("Nota final: " + notasCalculadas[i][3] + "\n");
			if (notasCalculadas[i][3] < 5) {

			}
		}
	}
}
