package recorrecciondelesamen;

public abstract class Venta {
    protected String idProducto;
	protected double precio;
	protected int cantidad;
	protected String marca;
	

	public String getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Venta(String idProducto, double precio, int cantidad, String marca) {
		super();
		this.idProducto = idProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.marca = marca;
	}







	@Override
	public String toString() {
		return " Identificador del producto " + this.idProducto + " precio " + this.precio + " cantidad " + this.cantidad + " marca " + this.marca;
				
	}


	abstract public double beneficio();
}
