package Reservas;

import java.io.*;

public class Reserva implements Serializable {
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

    public double descuento() {
        int i = 0;
        double[] des = { 0.11, 0.15, 0.22, 0.25, 0.31, 0.35 };
        int[] diasv = { 6, 8, 10, 13, 16, 19 };
        for (int t = 0; t < diasv.length; t++) {
            if (numeroDias == diasv[t]) {
                i = t;
            }
        }
        return des[i];
    }

    public double precioFinal() {
        return precioBase * numeroPersonas * numeroDias * descuento();
    }

    public String toString() {
        return "Nombre del cliente: " + nombreCliente + "\nNumero de dias: " + numeroDias + "\nPrecio base: "
                + precioBase
                + "\nNumero de personas: " + numeroPersonas + "\nDescuento: " + descuento() + "\nPrecio final: "
                + precioFinal();
    }

}
