package vuelos;

import java.io.Serializable;

public class Reserva implements Serializable{
	
	private String nombreCliente;
	private int numeroDias;
	private double precioBase;
	private int numeroPersonas;
	
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(String nombreCliente, int numeroDias, double precioBase, int numeroPersonas) {
		super();
		this.nombreCliente = nombreCliente;
		this.numeroDias = numeroDias;
		this.precioBase = precioBase;
		this.numeroPersonas = numeroPersonas;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	@Override
	public String toString() {
		return "Reserva [nombreCliente=" + nombreCliente + ", numeroDias=" + numeroDias + ", precioBase=" + precioBase
				+ ", numeroPersonas=" + numeroPersonas + "]";
	}

}
