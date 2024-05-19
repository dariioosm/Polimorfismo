package llamadas;

public class LlamadaEstandar extends Llamada {

    public LlamadaEstandar(String numOrigen, String numDestino, int duracion) {
		super(numOrigen, numDestino, duracion);
		
	}



	private final double estLlam = 0.25; 
	
	
	
	public double calcularCoste() {
		
		double coste = 0.29*duracion + estLlam;
		
		return coste;
		
	}
}
