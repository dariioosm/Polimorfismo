package calificaciones;

public class Notas {

	public static void main(String[] args) {
		
		Notas nota= new Notas();
		
		String [] titulos= new String[]{"ALUMNO","PRACTICA","PROBLEMAS","TEORIA"};
		String []alumnos= new String[]{"AAA AAA","BBB BBB","CCC CCC","FFF FFF","JJJ JJJ"};
		double[][] notas= new double[][] {
									{2,7,4},
									{1,2,3},
									{1,9,4},
									{3,5,8},
									{7,5,3}};
		
		nota.mostrarMatriz(titulos,alumnos,notas);
		nota.notas(alumnos, notas);
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
	
	public static void notas(String[]alumnos,double[][] notas) {
		int pos=0;
		double suma=0;
		double notaPra,notaPro,notaT;
		
		for(int i=0; i<notas.length;i++) {
			for(int j=0; j<notas[0].length;j++) {
				notaPra=notas[i][0]*0.1;
				notaPro=notas[i][1]*0.5;
				notaT=notas[i][2]*0.4;
				
				System.out.println("\n"+ " Alumno "+alumnos[i]+"La nota practica es "+notaPra+"La nota problemas es: "+notaPro+
						"La nota teorica es: "+notaT+" La nota final es: "+(suma=notaPra+notaPro+notaT)+"\n");

			}
			
		}
		
	}	
	
	
}
