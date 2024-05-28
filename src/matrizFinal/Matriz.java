package matrizFinal;

import java.util.Random;

public class Matriz {
    /* matriz 10*5 random 100+1 y que se guarde numeros pares en un vector e impares en otro */
    public static void main(String[] args) {
        Matriz matriz= new Matriz();
        int [][] tabla= new int[10][5];
        Random random = new Random();
        int memoriaPar[]= new int[50];
        int memoriaImpar[]= new int[50];

        matriz.cargaMatriz(tabla);
        matriz.verMatriz(tabla);
        matriz.guardaNumeros(tabla, memoriaPar, memoriaImpar);
        matriz.imprimeImpar(memoriaImpar);
        matriz.imprimePar(memoriaPar);
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

    public void guardaNumeros(int [][]tabla,int[]memoriaPar,int [] memoriaImpar){
        for(int i=0; i<tabla.length;i++){
            for(int j=0; j<tabla[0].length;j++){
                if(tabla[i][j]%2==0){
                    memoriaPar[i]=tabla[i][j];
                }
                else{
                    memoriaImpar[i]=tabla[i][j];
                }
            }
        }
    }
    public void imprimePar(int[]memoriaPar){
        System.out.println("**** NUMEROS PARES EN VECTOR PAR ****");
        for(int i=0; i<memoriaPar.length;i++){
            if(memoriaPar[i]!=0){
                System.out.println("En la posicion ["+i+"] se encuentra el numero "+memoriaPar[i]);
            }
            
        }
    }
    public void imprimeImpar(int [] memoriaImpar){
        System.out.println("**** NUMERO IMPARES EN VECTOR IMPAR ****");
        for(int i=0;i<memoriaImpar.length;i++){
            if(memoriaImpar[i]!=0){
                System.out.println("En la posicion ["+i+"] se encuentra el numero "+memoriaImpar[i]);
            }
           
        }
    }
}
