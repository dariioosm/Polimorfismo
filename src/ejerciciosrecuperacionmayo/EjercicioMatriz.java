package ejerciciosrecuperacionmayo;
import java.util.*;
public class EjercicioMatriz {
    public static void main(String[] args) {
        EjercicioMatriz matriz= new EjercicioMatriz();
        int[][] tabla= new int[10][5];//matriz que va a contener los numeros aleatorios
      //  int[] posicion= new int[];
        Random random= new Random();
        matriz.cargaMatriz(tabla);
        matriz.verMatriz(tabla);
        matriz.multiCinco(tabla);
    }


//metodo cargar
    public void cargaMatriz(int[][]tabla){
        
        Random random= new Random();
        //bucle anidado para meter los numeros random
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[0].length;j++){
                tabla[i][j] = random.nextInt(1001);
                }
        }
    }
    //metodo imprimir
       public void verMatriz(int[][] tabla){
         //bucle anidado para la impresion de los datos
         for(int i=0; i<tabla.length;i++){
            System.out.println();//print vacio para que salte linea
            for(int j=0; j<tabla[0].length;j++){
                System.out.print(tabla[i][j]+" "); //print que imprime en la misma linea
            }
            
        }
       }
       //metodo que cuenta multiplos de 5 por columnas
       public void multiCinco(int [][]tabla){
        for (int i=0; i<tabla.length;i++){
            for(int j=0;j<tabla[0].length;j++){
                    if (tabla[i][j]%5==0) {//si el resto es 0 al dividir entre 5
                        System.out.println("El numero "+tabla[i][j]+" que esta en la posicion " +" Fila: "+i+" Columna: " +j+" Es multiplo de 5");
                    }
            }
        }
       }

       //metodo que almacena en un vector los pares en posiciones pares y los impares en posicion impar
       
       public void almacenaValor(int[][]tabla, int[]posicion){
        for(int i=0; i<tabla.length;i++){
            for(int j=0; j<tabla[0].length;j++){

            }
        }
       }





    }

