package ejercicioFinalMayo;

public abstract class Electrodomestico {
    protected double precioBase;
    protected int peso;
    protected char letra;
    protected String colores;

    private static final char[] CONSUMOS_VALIDOS = { 'A', 'B', 'C', 'D', 'E', 'F' };
    private static final String[] COLORES_VALIDOS = { "blanco", "negro", "rojo", "azul", "gris" };

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
        this.precioBase = 100;
        this.peso = 5;
        this.letra = 'F';
        this.colores = "blanco";
    }

    public Electrodomestico(double precioBase, int peso, char letra, String colores) {
        super();
        this.precioBase = precioBase;
        this.peso = peso;
        this.letra = letra;
        this.colores = colores;
    }

   

    public void comprobarConsumoEnergetico(char[] CONSUMOS_VALIDOS) {
        for (int i = 0; i < CONSUMOS_VALIDOS.length; i++) {
            if (letra != CONSUMOS_VALIDOS[i]) {
                System.out.println("Letra introducida: " + CONSUMOS_VALIDOS[i]);
            } else {
                System.out.println("Letra no valida, introduce una dentro de A-F");
            }
        }
    }

    public void comprobarColor(String[] COLORES_VALIDOS) {
        for (int i = 0; i < COLORES_VALIDOS.length; i++) {
            if (COLORES_VALIDOS[i].equalsIgnoreCase(colores)) {
                System.out.println("Color seleccionado: " + COLORES_VALIDOS[i]);
            } else {
                System.out.println("Color no valido, introduce uno de estos colores: blanco, negro, rojo, azul, gris");
            }
        }
    }

    public abstract double precioFinal();

    @Override
    public String toString() {
        return "\n" + "Electrodomestico -> precioBase " + precioBase + " peso " + peso + " letra " + letra + " colores "
                + colores;
    }
}
