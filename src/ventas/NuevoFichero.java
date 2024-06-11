package ventas;

<<<<<<< HEAD
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
=======
public class NuevoFichero {

private String fechaHora;

private double ingreso;


public String getFechaHora() {
    return fechaHora;
}

public void setFechaHora(String fechaHora) {
    this.fechaHora = fechaHora;
}

public double getIngreso() {
    return ingreso;
}

public void setIngreso(double ingreso) {
    this.ingreso = ingreso;
}

public NuevoFichero(String fechaHora, double ingreso) {
    this.fechaHora = fechaHora;
    this.ingreso = ingreso;
}
>>>>>>> 5766385e804076bde8677b459243fc8764fe132c

    @Override
    public String toString() {
        return " ---- NuevoFichero fechaHora " + fechaHora + ", Ingreso de las entradas vendidas "
                + calcularIngresoVenta();
    }

}
