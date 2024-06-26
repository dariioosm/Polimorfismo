package ejercicioFinalMayo2;

import java.io.Serializable;

public class Lavadora extends Electrodomestico implements Serializable {

    private int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, int peso, char letra, String colores, int carga) {
        super(precioBase, peso, letra, colores);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + " *** Lavadora -> carga" + carga;
    }

    @Override
    public double precioFinal() {
        /*
         * Segun el consumo energetico, se aumenta el precio del electrodomestico
         * 
         */

        double precioFin = precioBase;
        int[] plus = { 100, 80, 60, 50, 30, 10 };
        char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F' };
        for (int i = 0; i < letras.length; i++) {
            // para comparar char entre ellos se utiliza igual
            // para comparar string se utiliza el equals
            if (letra == letras[i]) {
                precioFin += plus[i];
            }
        }
        if (peso >= 0 && peso <= 19) {
            precioFin += 10;
        } else if (peso >= 20 && peso <= 49) {
            precioFin += 50;
        } else if (peso >= 50 && peso <= 79) {
            precioFin += 80;
        } else if (peso > 80) {
            precioFin += 100;
        }
        if (carga > 30) {
            precioFin += 30;
        }

        return precioFin;
    }

}
