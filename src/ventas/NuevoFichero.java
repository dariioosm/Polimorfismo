package ventas;

import java.io.Serializable;

public class NuevoFichero extends Venta implements Serializable {

    private String fechaHora;

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public double calcularIngresoVenta() {
        VentaRedBull vrb = new VentaRedBull();
        int[] precio = { 350, 250, 100, 60 };
        String[] tipo = { "SP", "GP", "GA", "EG" };
        double ingreso = 0;
        for (int i = 0; i < tipo.length; i++) {
            if (vrb.getTipoEntrada().equalsIgnoreCase(tipo[i])) {
                ingreso = vrb.getNumeroEntradas() * precio[i];
            }
        }
        return ingreso;
    }

    @Override
    public String toString() {
        return " ---- NuevoFichero fechaHora " + fechaHora + ", Ingreso de las entradas vendidas "
                + calcularIngresoVenta();
    }

}
