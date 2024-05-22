package recorrecciondelesamen;

public class VentaTienda extends Venta {

    protected String vendedor;
	protected String ubicacion;
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public VentaTienda( String idProducto, double precio, int cantidad, String marca,String vendedor, String ubicacion) {
		super(idProducto,precio, cantidad,marca);
		this.vendedor = vendedor;
		this.ubicacion = ubicacion;
	}
	public VentaTienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	//metodo abstracto de Venta
	@Override
	public double beneficio() {
        String[] marcasRopa = { "Nike", "Adidas", "Zara", "H&M", "GAP" };
        double[] porcentajes_ventaLocal = { 0.02,0.05,0.10,0.20,0.28};
        double beneficio = 0;

        for (int i = 0; i < marcasRopa.length; i++) {
            if (this.marca.equals(marcasRopa[i])) {
                beneficio = this.precio * this.cantidad * porcentajes_ventaLocal[i];
            }
        }
        return beneficio;
	}
	@Override
	public String toString() {
		return "\n"+"VentaLocal "+super.toString()+" vendedor "+this.vendedor+" ubicacion de la tienda "+this.ubicacion; 
	}
	
    
}
