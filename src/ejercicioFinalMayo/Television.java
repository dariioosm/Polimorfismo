package ejercicioFinalMayo;

public class Television extends Electrodomestico {

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

    @Override
    public double precioFinal() {

        double precioFin = precioBase;

        int[] plus = { 100, 80, 60, 50, 30, 10 };
        int[] letras = { 'A', 'B', 'C', 'D', 'E', 'F' };
        for (int i = 0; i < letras.length; i++) {
            if (letra == letras[i]) {
                precioFin += plus[i];
                break;
            }
        }
        if (peso >= 0 && peso < 20) {
            precioFin += 10;
        } else if (peso > 19 && peso < 50) {
            precioFin += 50;
        } else if (peso > 49 && peso < 80) {
            precioFin += 80;
        } else if (peso > 80) {
            precioFin += 100;
        }
        if (resolucion > 40) {
            precioFin = precioFin * 1.3;
        } else if (smartTv = true) {
            precioFin = precioFin + 50;
        }
        return precioFin;
    }

}
