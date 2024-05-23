package ejercicioFinalMayo;

public class Electrodomestico {
    protected double precioBase;
    protected int peso;
    protected char[] consumo = { 'A', 'B', 'C', 'D', 'E', 'F' };
    protected String[] color = { "Blanco", "Negro", "Rojo", "Azul", "Gris" };

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

    public char[] getConsumo() {
        return consumo;
    }

    public void setConsumo(char[] consumo) {
        this.consumo = consumo;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public Electrodomestico() {

    }

    public Electrodomestico(double precioBase, int peso, char[] consumo, String[] color) {
        super();
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumo = consumo;
        this.color = color;
    }

    public void comprobarConsumoEnergetico(char consumo) {

    }

    public void comprobarColor(String color) {

    }

    public double precioFinal() {
        double precioFin;
        return precioFin;
    }

}
