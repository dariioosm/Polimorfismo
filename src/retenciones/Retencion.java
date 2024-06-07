package retenciones;

public class Retencion {
    public static void main(String[] args) {
        Retencion ret = new Retencion();
        String[] titulos = { "COD_TRABAJADOR", "SALARIO_BASE", "COMPLEMENTOS", "GASTOS" };
        String[] codigos = { "1AAA", "2BBB", "6CCC", "12RR", "32HH" };
        int[] suma = { 0, 0, 0, 0, 0 };
        double[] fin = { 0, 0, 0, 0, 0 };
        int[][] numeros = {
                { 2000, 700, 40 },
                { 1000, 200, 30 },
                { 1000, 90, 40 },
                { 3000, 500, 80 },
                { 700, 50, 30 },
        };
        ret.imprimeMatriz(titulos, codigos, numeros);
        ret.retencion(codigos, numeros, suma);
        ret.imprimeRet(codigos, suma, fin);
    }

    public void imprimeMatriz(String[] titulos, String[] codigos, int[][] numeros) {
        for (int i = 0; i < titulos.length; i++) {
            System.out.print(titulos[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < codigos.length; i++) {
            System.out.print(codigos[i] + "\t");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(" " + "\t" + numeros[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public void retencion(String[] codigos, int[][] numeros, int[] suma) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                suma[i] += numeros[i][j];
            }
        }
    }

    public void imprimeRet(String[] codigos, int[] suma, double[] fin) {
        int[] min = { 0, 1000, 1300, 1800 };
        int[] max = { 999, 1299, 1799, 5000 };
        double[] ret = { 0.03, 0.07, 0.12, 0.21 };
        for (int i = 0; i < suma.length; i++) {
            if (suma[i] >= min[i] && suma[i] <= max[i]) {
                fin[i] = ret[i] * suma[i];
            }
            System.out.println("la retencion aplicada al trabajador " + codigos[i] + " es " + fin[i] + " euros");
        }

    }

}
