package ejercicioFinalMayo2;

import java.io.Serializable;

public class Television extends Electrodomestico implements Serializable {

    private int resolucion;
    private boolean smartTv;

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    public Television() {
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(int resolucion, boolean smartTv) {
        this.resolucion = resolucion;
        this.smartTv = smartTv;
    }

    public Television(double precioBase, int peso, char letra, String colores, int resolucion, boolean smartTv) {
        super(precioBase, peso, letra, colores);
        this.resolucion = resolucion;
        this.smartTv = smartTv;
    }

    @Override
    public double precioFinal() {

        double precioFin = precioBase;

        int[] plus = { 100, 80, 60, 50, 30, 10 };
        int[] letras = { 'A', 'B', 'C', 'D', 'E', 'F' };
        for (int i = 0; i < letras.length; i++) {
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
        if (resolucion > 40) {
            precioFin = precioFin * 1.3;
        }
        if (smartTv == true) {
            precioFin = precioFin + 50;
        }
        return precioFin;
    }

    @Override
    public String toString() {
        return super.toString() + " *** Television -> resolucion " + resolucion + " smartTv " + smartTv;
    }

}
