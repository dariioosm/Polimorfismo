package ventas;

import java.io.Serializable;

public class VentaRedBull extends Venta implements Serializable {

    private String tipoEntrada;
    private int numeroEntradas;

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public int getNumeroEntradas() {
        return numeroEntradas;
    }

    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }

    public VentaRedBull() {
        super();
    }

    public VentaRedBull(String fechaHora, String evento, String tipoEntrada, int numeroEntradas) {
        super(fechaHora, evento);
        this.tipoEntrada = tipoEntrada;
        this.numeroEntradas = numeroEntradas;
    }

    @Override
    public String toString() {
        return super.toString() + " --- VentaRedBull tipoEntrada " + tipoEntrada + ", numeroEntradas " + numeroEntradas
                + "\n";
    }

    @Override
    public double calcularIngresoVenta() {
        int[] precio = { 350, 250, 100, 60 };
        String[] tipo = { "SP", "GP", "GA", "EG" };
        double ingreso = 0;
        for (int i = 0; i < tipo.length; i++) {
            if (getTipoEntrada().equalsIgnoreCase(tipo[i])) {
                ingreso = getNumeroEntradas() * precio[i];
            }
        }
        return ingreso;
    }

}
