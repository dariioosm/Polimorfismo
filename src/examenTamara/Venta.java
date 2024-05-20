package examenTamara;

import java.io.Serializable;

public class Venta implements Serializable {
    private String idProducto;
    private double precio;
    private int cantidad;
    private String marca;

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

    @Override
    public String toString() {
        return "ID: " + this.idProducto + " Precio: " + this.precio + "� Cantidad: " + this.cantidad + " Marca: "
                + this.marca;
    }

    public double calcularBeneficio() {
        String[] marcasRopa = { "Nike", "Adidas", "Zara", "H&M", "GAP" };
        double[] porcentajes = { 0.11, 0.15, 0.23, 0.25, 0.31 };
        double benef = 0;

        for (int i = 0; i < 5; i++) {
            if (this.marca.equals(marcasRopa[i])) {
                benef = this.precio * this.cantidad * porcentajes[i];
            }
        }

        return benef;
    }

}
