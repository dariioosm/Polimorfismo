package vuelos;

public class ReservaVuelo extends Reserva {
	
	private String origen;
	private String destino;

	public ReservaVuelo() {
		// TODO Auto-generated constructor stub
	}

	public ReservaVuelo(String nombreCliente, int numeroDias, double precioBase, int numeroPersonas, String origen, String destino) {
		super(nombreCliente, numeroDias, precioBase, numeroPersonas);
		this.origen = origen;
		this.destino = destino;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "ReservaVuelo [nombreCliente= " + getNombreCliente() + ", numeroDias= " + getNumeroDias() + ", precioBase= " + 
				getPrecioBase() + ", numeroPersonas= " + getNumeroPersonas() + "origen=" + origen + ", destino=" + destino + "]";
	}

}
