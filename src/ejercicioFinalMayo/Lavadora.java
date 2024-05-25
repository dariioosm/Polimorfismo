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
    public double precioFinal() {
        /*
         * Segun el consumo energetico, se aumenta el precio del electrodomestico
         * 
         */
        double precioFin = 0;
        int[] plus = { 100, 80, 60, 50, 30, 10 };
        int[] letras = { 'A', 'B', 'C', 'D', 'E', 'F' };
        for (int i = 0; i < letras.length; i++) {
            if (letra == letras[i]) {
                precioFin = precioBase + plus[i];
            }
        }
        if (peso >= 0 && peso < 20) {
            precioFin = precioFin + 10;
        } else if (peso > 19 && peso < 50) {
            precioFin = precioFin + 50;
        } else if (peso > 49 && peso < 80) {
            precioFin = precioFin + 80;
        } else if (peso > 80) {
            precioFin = precioFin + 100;
        }

        return precioFin;
    }

}
