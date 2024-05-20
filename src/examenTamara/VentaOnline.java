package examenTamara;

public class VentaOnline extends Venta {
    protected String metodoPago;
    protected String direccionEnvio;

    public VentaOnline(String idProducto, double precio, int cantidad, String marca, String metodoPago,
            String direccionEnvio) {
        super(idProducto, precio, cantidad, marca);
        this.metodoPago = metodoPago;
        this.direccionEnvio = direccionEnvio;
    }

    public VentaOnline() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "VentaOnline -->" + super.toString() + " M�todo de pago: " + this.metodoPago + " Direcci�n de env�o: "
                + this.direccionEnvio;
    }

}
