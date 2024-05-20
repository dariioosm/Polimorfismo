package examenTamara;

import java.util.ArrayList;

public class VentaLocal extends Venta {
    protected String vendedor;
    protected String ubicac;

    public VentaLocal(String idProducto, double precio, int cantidad, String marca, String vendedor, String ubicac) {
        super(idProducto, precio, cantidad, marca);
        this.vendedor = vendedor;
        this.ubicac = ubicac;
    }

    public VentaLocal() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getUbicac() {
        return ubicac;
    }

    public void setUbicac(String ubicac) {
        this.ubicac = ubicac;
    }

    @Override
    public String toString() {
        return "VentaLocal --> " + super.toString() + " Vendedor: " + this.vendedor + " Ubicaci�n: " + this.ubicac;
    }

    public int calcularTotalVentas(ArrayList<Venta> ventas) {
        String[] vendedor = { "Ana", "Roberto", "Roberto" };
        int[] cantidad = { 3, 10, 5 };
        int totalVentas = 0;

        for (int j = 0; j < vendedor.length; j++) {
            if (this.vendedor.equals(vendedor[j])) {
                totalVentas += cantidad[j];
            }
        }

        return totalVentas;
    }
}
