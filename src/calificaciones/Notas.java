package calificaciones;

public class Notas {

	public static void main(String[] args) {
		
		Notas nota= new Notas();
		double notaPra=0;
		double notaPro=0;
		double notaT=0;
		double notaPa=0;
		double notaPo=0;
		double notaTe=0;
		String [] titulos= new String[]{"ALUMNO","PRACTICA","PROBLEMAS","TEORIA"};
		String []alumnos= new String[]{"AAA AAA","BBB BBB","CCC CCC","FFF FFF","JJJ JJJ"};
		double[][] notas= new double[][] {
									{2,7,4},
									{1,2,3},
									{1,9,4},
									{3,5,8},
									{7,5,3}};
		
		nota.mostrarMatriz(titulos,alumnos,notas);
		nota.notas(alumnos, notas,notaPra,notaPro,notaT, notaPa,notaPo,notaTe);
		nota.verNotas(alumnos, notas, notaPra, notaPro, notaT);
	}
	public static void mostrarMatriz(String [] titulos, String [] alumnos,double [][] notas) {  /* sacar por pantalla los datos tabulados */
		
		for(int i=0; i<titulos.length;i++) {
			System.out.print(titulos[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<alumnos.length;i++) { 
			System.out.print(alumnos[i]+"\t");
			for(int j=0;j<notas[i].length;j++) {
				System.out.print(" "+notas[i][j]+"\t"+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void notas(String[]alumnos,double[][] notas,double notaPra,double notaPro,double notaT,double notaPa,double notaPo,double notaTe) {
	
		for(int i=0; i<notas.length;i++) {
			for(int j=0; j<notas[0].length;j++) {
				notaPra=notas[i][0]*0.1;
				notaPro=notas[i][1]*0.5;
				notaT=notas[i][2]*0.4;
			}
		}
		notaPa=notaPra;
		notaPo=notaPro;
		notaTe=notaT;
	}	
	
	public static void verNotas(String[]alumnos,double[][] notas,double notaPa,double notaPo,double notaTe){
		double suma=0;
		for(int i=0;i<alumnos.length;i++){
			System.out.println("\n"+ " Alumno "+alumnos[i]+"La nota practica es "+notaPa+"La nota problemas es: "+notaPo+
						"La nota teorica es: "+notaTe+" La nota final es: "+(suma=notaPa+notaPo+notaTe)+"\n");

		}
	}	
}
