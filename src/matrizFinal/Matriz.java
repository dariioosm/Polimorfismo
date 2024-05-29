package matrizFinal;

import java.util.Random;

public class Matriz {
    /*
     * matriz 10*5 random 100+1 y que se guarde numeros pares en un vector e impares
     * en otro
     */
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        int[][] tabla = new int[10][5];
        Random random = new Random();
        int memoriaPar[] = new int[50];
        int memoriaImpar[] = new int[50];

        matriz.cargaMatriz(tabla);
        matriz.verMatriz(tabla);
        matriz.guardaNumeros(tabla, memoriaPar, memoriaImpar);
        matriz.imprimeImpar(memoriaImpar);
        matriz.imprimePar(memoriaPar);
        matriz.maximoMinimo(memoriaPar, memoriaImpar);
        matriz.maximoMininoTabla(tabla);
        matriz.encontrarPrimos(tabla);
    }

    public void cargaMatriz(int[][] tabla) {
        Random random = new Random();
        // bucle anidado para meter los numeros random
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public void verMatriz(int[][] tabla) {
        // bucle anidado para la impresion de los datos
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(); // print vacio para que salte linea
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print("\t" + tabla[i][j] + " "); // print que imprime en la misma linea
            }
        }
    }

    public void guardaNumeros(int[][] tabla, int[] memoriaPar, int[] memoriaImpar) {
        int indicePar = 0;
        int indiceImpar = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                if (tabla[i][j] % 2 == 0) {
                    memoriaPar[indicePar++] = tabla[i][j];
                } else {
                    memoriaImpar[indiceImpar++] = tabla[i][j];
                }
            }
        }
    }

    public void imprimePar(int[] memoriaPar) {
        System.out.println();
        System.out.println("**** NUMEROS PARES EN VECTOR PAR ****" + "\n");
        for (int i = 0; i < memoriaPar.length; i++) {
            if (memoriaPar[i] != 0) {
                System.out.println("En la posicion [" + i + "] se encuentra el numero " + memoriaPar[i] + "\n");
            }

        }
    }

    public void imprimeImpar(int[] memoriaImpar) {
        System.out.println();
        System.out.println();
        System.out.println("**** NUMERO IMPARES EN VECTOR IMPAR ****" + "\n");
        for (int i = 0; i < memoriaImpar.length; i++) {
            if (memoriaImpar[i] != 0) {
                System.out.println("En la posicion [" + i + "] se encuentra el numero " + memoriaImpar[i] + "\n");
            }
        }
    }

    public void maximoMinimo(int[] memoriaPar, int[] memoriaImpar) {
        int maxP = 1;
        int minP = 999;
        int maxI = 1;
        int minI = 999;
        // bucle para los pares
        for (int i = 0; i < memoriaPar.length; i++) {
            if (memoriaPar[i] > maxP) {
                maxP = memoriaPar[i];
            } else if (memoriaPar[i] < minP && memoriaPar[i] != 0) {
                minP = memoriaPar[i];
            }
        }
        System.out.println();
        System.out.println("*** MAXIMO Y MINIMOS DE LAS MEMORIAS PAR E IMPAR ***");
        System.out.println();
        System.out.println("El mayor par es: " + maxP + " el menor par es: " + minP);

        // bucle para impares
        for (int j = 0; j < memoriaImpar.length; j++) {
            if (memoriaImpar[j] > maxI) {
                maxI = memoriaImpar[j];
            } else if (memoriaImpar[j] < minI && memoriaImpar[j] != 0) {
                minI = memoriaImpar[j];
            }
        }
        System.out.println("\n" + "El mayor impar es: " + maxI + " el menor impar es: " + minI);

    }

    public void maximoMininoTabla(int[][] tabla) {
        int max = 1;
        int imin = 0;
        int imax = 0;
        int jmax = 0;
        int jmin = 0;
        int min = 999;
        // sacar posicion de los maximos y minimos
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                if (tabla[i][j] > max) {
                    max = tabla[i][j];
                    imax = i;
                    jmax = j;

                }
                if (tabla[i][j] < min) {
                    min = tabla[i][j];
                    imin = i;
                    jmin = j;
                }
            }
        }
        System.out.println();
        System.out.println("*** MAXIMOS Y MINIMOS DE LA TABLA ***");
        System.out.println();
        System.out.println(
                "El maximo de la tabla es: " + max + " en la posicion [" + (imax + 1) + "] [" + (jmax + 1) + "]");
        System.out.println(
                "El minimo de la tabla es: " + min + " en la posicion [" + (imin + 1) + "] [" + (jmin + 1) + "]");
    }

    public static void encontrarPrimos(int[][] tabla) {
        int contadorPrimos = 0;
        System.out.println("\n" + "*** NUMEROS PRIMOS CONTENIDOS EN LA MATRIZ ***");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                int num = tabla[i][j];
                boolean esPrimo = true;

                if (num <= 1)
                    esPrimo = false;
                else {
                    for (int k = 2; k <= Math.sqrt(num); k++) {
                        if (num % k == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }

                if (esPrimo) {
                    contadorPrimos++;
                    System.out.println("\n" + "El número primo " + num + " está en la posición [" + i + "][" + j + "]");
                }
            }
        }

        System.out.println("\n" + "El número total de primos en la matriz es: " + contadorPrimos);
    }

}
