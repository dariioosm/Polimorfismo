package llamadas;

public abstract class Llamada {
    protected String origen;
    protected String desetino;
    protected int duracion;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDesetino() {
        return desetino;
    }

    public void setDesetino(String desetino) {
        this.desetino = desetino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Llamada() {
        super();
    }

    public Llamada(String origen, String desetino, int duracion) {
        this.origen = origen;
        this.desetino = desetino;
        this.duracion = duracion;
    }

    public abstract double calcularCoste();
}
