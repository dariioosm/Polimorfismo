package ventas;

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

    @Override
    public String toString() {
        return " ---- NuevoFichero fechaHora " + fechaHora + ", Ingreso de las entradas vendidas "
                + calcularIngresoVenta();
    }

}
