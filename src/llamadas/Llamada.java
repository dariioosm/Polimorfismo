package llamadas;

public abstract class Llamada {
    private String origen;
    private String desetino;
    private int duracion;

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

    public abstract int calcularCoste();
}
