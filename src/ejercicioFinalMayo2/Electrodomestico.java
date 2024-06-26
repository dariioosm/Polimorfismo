package ejercicioFinalMayo2;

import java.io.Serializable;

public abstract class Electrodomestico implements Serializable {
    protected double precioBase;
    protected int peso;
    protected char letra;
    protected String colores;

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, int peso) {
        super();
        this.precioBase = precioBase;
        this.peso = peso;

    }

    public Electrodomestico(double precioBase, int peso, char letra, String colores) {
        super();
        this.precioBase = precioBase;
        this.peso = peso;
        this.letra = letra;
        this.colores = colores;
    }

    public abstract double precioFinal();

    @Override
    public String toString() {
        return "\n" + "Electrodomestico -> precioBase " + precioBase + " peso " + peso + " letra " + letra + " colores "
                + colores;
    }
}
