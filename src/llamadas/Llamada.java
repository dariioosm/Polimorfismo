package llamadas;

import java.io.Serializable;

public abstract class Llamada implements Serializable {
    protected String origen;
    protected String destino;
    protected int duracion;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String desetino) {
        this.destino = desetino;
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

    public Llamada(String origen, String destino, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public abstract double calcularCoste();

    // siempre hay que poner un toString para que saque el contenido del arraylist
    // D:
    @Override
    public String toString() {
        return "Origen: " + origen + ", Destino: " + destino + ", Duración: " + duracion + " min";
    }
}
