package llamadas;

import java.io.Serializable;

public abstract class Llamada implements Serializable {

    String numOrigen;
    String numDestino;
    int duracion;

    public Llamada(String numOrigen, String numDestino, int duracion) {
        super();
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;

    }

    public String getNumOrigen() {
        return numOrigen;
    }

    public void setNumOrigen(String numOrigen) {
        this.numOrigen = numOrigen;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    abstract public double calcularCoste();

}
