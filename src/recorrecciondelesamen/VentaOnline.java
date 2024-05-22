package recorrecciondelesamen;

public class VentaOnline extends Venta {
    protected String metodoPago;
	protected String direccionEnvio;
	
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public String getDireccionEnvio() {
		return direccionEnvio;
	}
	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}
	public VentaOnline(String metodoPago, String direccionEnvio) {
		super();
		this.metodoPago = metodoPago;
		this.direccionEnvio = direccionEnvio;
	}
	
	public VentaOnline() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VentaOnline(String idProducto, double precio, int cantidad, String marca,String metodoPago, String direccionEnvio) {
		super(idProducto, precio, cantidad, marca);
		this.metodoPago = metodoPago;
		this.direccionEnvio = direccionEnvio;
	}
	@Override
	public double beneficio() {
		 String[] marcasRopa = { "Nike", "Adidas", "Zara", "H&M", "GAP" };
	        double[] porcentajes_ventaOnline = { 0.11, 0.15, 0.23, 0.25, 0.31 };
	        double beneficio = 0;

	        for (int i = 0; i < marcasRopa.length; i++) {
	            if (this.marca.equals(marcasRopa[i])) {
	                beneficio = this.precio * this.cantidad * porcentajes_ventaOnline[i];
	            }
	        }

	        return beneficio;
	}
	@Override
	public String toString() {
		return "\n"+"VentaOnline "+super.toString()+" metodo de pago"+this.metodoPago+" direccion de envio "+this.direccionEnvio ;
	}
}
