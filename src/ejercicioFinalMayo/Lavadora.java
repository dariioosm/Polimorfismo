package ejercicioFinalMayo;

public class Lavadora extends Electrodomestico {

    private int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora(double precioBase, int peso, char letra, String colores, int carga) {
        super(precioBase, peso, letra, colores);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + " Lavadora -> carga" + carga;
    }

    @Override
    public double precioFinal(double precioBase, char letra) {
        double precioFin = 0;

        /*
         * Segun el consumo energetico, se aumenta el precio del electrodomestico
         * 
         */
        if (letra == 'A') {
            precioFin = precioBase + 100;
        } else if (letra == 'B') {
            precioFin = precioBase + 80;
        } else if (letra == 'C') {
            precioFin = precioBase + 60;
        } else if (letra == 'D') {
            precioFin = precioBase + 50;
        } else if (letra == 'E') {
            precioFin = precioBase + 30;
        } else if (letra == 'F') {
            precioFin = precioBase + 10;
        }
        return precioFin;
    }

}
