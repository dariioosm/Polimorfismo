package ejerciciosrecuperacionmayo;
import java.util.*;
public class EjercicioMatriz {
    public static void main(String[] args) {
        EjercicioMatriz matriz= new EjercicioMatriz();
        int[][] tabla= new int[10][5];//matriz que va a contener los numeros aleatorios
        Random random= new Random();
        matriz.cargaMatriz(tabla);
        matriz.verMatriz(tabla);
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
                    
            }
        }
       }
 

    }

