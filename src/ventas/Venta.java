package ventas;

public abstract class Venta {
    protected String fechaHora;
    protected String evento;

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Venta() {

    }

    public Venta(String fechaHora, String evento) {
        this.fechaHora = fechaHora;
        this.evento = evento;
    }

    @Override
    public String toString() {
        return " Venta fechaHora: " + fechaHora + ", evento: " + evento;
    }

    public abstract double calcularIngresoVenta();
}
