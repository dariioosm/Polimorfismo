package calificaciones;

import java.text.DecimalFormat;

public class Metodos {
    static String[] titulos = new String[] { "ALUMNO", "PRACTICA", "PROBLEMAS", "TEORIA" };
    static String[] alumnos = new String[] { "AAA AAA", "BBB BBB", "CCC CCC", "FFF FFF", "JJJ JJJ" };
    static double[][] notas = new double[][] {
            { 2, 7, 4 },
            { 1, 2, 3 },
            { 1, 9, 4 },
            { 3, 5, 8 },
            { 7, 5, 3 } };

    public static void mostrarMatriz() {
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

    public void calcularNotas() {
        DecimalFormat df = new DecimalFormat("#.00");
        double suma[] = { 0, 0, 0, 0, 0 };
        for (int i = 0; i < notas.length; i++) {
            suma[i] = (notas[i][0] * 0.1 + notas[i][1] * 0.5 + notas[i][2] * 0.4);
        }

        for (int j = 0; j < notas.length; j++) {
            System.out.println(alumnos[j] + " " + df.format(suma[j]));
            if (suma[j] > 0 && suma[j] < 5) {
                System.out.println("|| Insuficiente");
            } else if (suma[j] >= 5 && suma[j] < 7) {
                System.out.println("|| Aprobado");
            }
            if (suma[j] >= 7 && suma[j] < 10) {
                System.out.println("|| Destacado");
            }
        }
    }

}
