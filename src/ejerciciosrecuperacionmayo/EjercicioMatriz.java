package ejerciciosrecuperacionmayo;

import java.util.Random;

public class EjercicioMatriz {
    public static void main(String[] args) {
        EjercicioMatriz matriz = new EjercicioMatriz();
        int[][] tabla = new int[10][5]; // matriz que va a contener los numeros aleatorios
        Random random = new Random();
        int[] memoria = new int[50];// la longitud del vector es la multiplicacion del x y de la matriz
        matriz.cargaMatriz(tabla);
        matriz.verMatriz(tabla);
        matriz.multiCinco(tabla);
        System.out.println(
                "Si hay mas numero mayor proporcion de numeros pares o impares, el contenido del array se llena con '0'");
        matriz.almacenaValor(tabla, memoria);
    }

    // metodo cargar
    public void cargaMatriz(int[][] tabla) {
        Random random = new Random();
        // bucle anidado para meter los numeros random
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = random.nextInt(1000) + 1;
            }
        }
    }

    // metodo imprimir
    public void verMatriz(int[][] tabla) {
        // bucle anidado para la impresion de los datos
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(); // print vacio para que salte linea
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print("\t" + tabla[i][j] + " "); // print que imprime en la misma linea
            }
        }
    }

    // metodo que cuenta multiplos de 5 por columnas
    public void multiCinco(int[][] tabla) {
        int cont = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                if (tabla[i][j] % 5 == 0 && tabla[i][j] != 0) { // si el resto es 0 al dividir entre 5
                    cont++;
                    System.out.println();
                    System.out.println("El numero " + tabla[i][j] + " que esta en la posicion " + " Fila: " + (i + 1)
                            + " Columna: " + (j + 1) + " es multiplo de 5");
                }
            }
        }
        System.out.println("Hay un total de: " + cont + " numeros que son multiplos de 5");
    }

    // metodo que almacena en un vector los pares en posiciones pares y los impares
    // en posiciones impares
    public void almacenaValor(int[][] tabla, int[] memoria) {
        // el int par e int impar, los utilizamos para pasar al indice siguiente y el
        // par empieza en 0 para que +2 +4 +6... y el impar para que +1 +3 +5...

        int par = 0;
        int impar = 1;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                if (tabla[i][j] % 2 == 0) {
                    if (par < memoria.length) {
                        memoria[par] = tabla[i][j];
                        par += 2;
                    }
                } else {
                    if (impar < memoria.length) {
                        memoria[impar] = tabla[i][j];
                        impar += 2;
                    }
                }
            }
        }
        System.out.println("\nEl contenido del vector memoria:");
        for (int k = 0; k < memoria.length; k++) {
            if (memoria[k] != 0) {
                System.out.print("\n" + "En la posicion [" + k + "] está el número: " + memoria[k] + " " + "\n");
            }

        }
        System.out.println();
    }
}
