package banquito;

import java.io.*;

public class Plazos extends Cuenta implements Serializable {
    private int dias;
    private double tipoInteres;

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public Plazos(String codigo, String titular, double saldo, int dias, double tipoInteres) {
        super(codigo, titular, saldo);
        this.dias = dias;
        this.tipoInteres = tipoInteres;
    }

    @Override
    public double calculaInteres() {
        double interes = (dias * tipoInteres * saldo) / 365;
        return interes;
    }

    @Override
    public String toString() {
        return super.toString() + "Plazos [dias=" + dias + ", tipoInteres=" + tipoInteres + "]";
    }

}
