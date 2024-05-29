package matrizFinal;

import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
		Matriz tabla= new Matriz();
		 int[][]matriz= new int[4][4];
		 int fila=0,columna = 0,op;
		 boolean salir=false;
		 boolean rellena=false;
		 Scanner in= new Scanner(System.in);
		do {
			System.out.println("\t"+"=====MENU=====");
			System.out.println("Elige opcion:");
			System.out.println("1.Rellenar matriz");
			System.out.println("2.Suma de fila elegida por usuario");
			System.out.println("3.Suma de columa elegida por usuario");
			System.out.println("4.Suma la diagonal principal");
			System.out.println("5.Suma la diagonal invertida");
			System.out.println("6.Media de los numeros de la matriz");
			System.out.println("7.Salir");
			op=in.nextInt();
			switch(op) {
			case 1:
				tabla.rellenaMatrizTeclado(matriz,fila,columna);
				rellena=true;
				break;
			case 2:
				if(rellena=true) {
					do {
						System.out.print("Elige fila que desees sumar: ");
						fila=in.nextInt();
						
					} while (!(fila>=0&&fila<=matriz.length));
					System.out.println("La suma de los numeros de la fila "+fila+" es: "+sumaFila(matriz,fila));
				}else {
					System.out.println("No se ha rellenado la matriz");
				}
				break;
			case 3:
				if(rellena=true) {
					do {
						System.out.print("Elige columna que desees sumar: ");
						columna=in.nextInt();
						
					} while (!(columna>=0&&columna<=matriz.length));
					System.out.println("La suma de los numeros de la fila "+columna+" es: "+sumaColumna(matriz,columna));
				}else {
					System.out.println("No se ha rellenado la matriz");
				}
				
				break;
			case 4:
				if(rellena) {
					System.out.println("La suma de la diagonal es: "+sumaDiagonalPrincipal(matriz));
				}else {
					System.out.println("La matriz no se ha rellenado");
				}
				
				break;
			case 5:
				if(rellena) {
					System.out.println("La suma de la diagonal secundaria es: "+sumaDiagonalInvertida(matriz));
				}else {
					System.out.println("La matriz no se ha rellenado");
				}
				
				break;
			case 6:
				if(rellena) {
					System.out.println("El promedio de los numeros de la matriz es: "+promedioMatriz(matriz));
					
					
				}else {
					System.out.println("La matriz no se ha rellenado");
				}
				
				break;
			case 7:
				salir=true;
				break;
			
			default:
				System.out.println("Ha salido del programa"+"\n"+"Introduce un numero 1-7");
				break;
			}
		}
		while(!salir);
		System.out.println("fin");
	}
	
	
	public static void rellenaMatrizTeclado(int[][]matriz,int fila,int columna) {
		Scanner in= new Scanner(System.in);
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.println("Introduzca el numero de la posicion ["+i+"]["+j+"]");
				matriz[i][j]=in.nextInt();
			}
		}
	}
	
	public static int sumaFila(int[][]matriz,int fila) {
		int suma=0;
		for(int j=0;j<matriz.length;j++) {
			suma+=matriz[fila][j];	
		}
		return suma;
	}
	public static int sumaColumna(int[][]matriz,int columna) {
		int suma=0;
		for(int i=0;i<matriz.length;i++) {
			suma+=matriz[i][columna];	
		}
		return suma;
	}
	
	public static int sumaDiagonalPrincipal(int [][]matriz) {
		int suma =0;
		for(int i=0,j=0;i<matriz.length;i++,j++) {
			suma+=matriz[i][j];
		}
		
		return suma;
	}
	
	public static int sumaDiagonalInvertida(int [][]matriz) {
		int suma=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=3;j<matriz[0].length;j--) {
				suma+=matriz[i][j];
			}
		}
		return suma;
	}
	public static double promedioMatriz(int [][]matriz) {
		int suma=0;
		double promedio=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				suma+=matriz[i][j];
			}
		}
		promedio=suma/(matriz.length*matriz.length);
		return promedio;
	}
}
