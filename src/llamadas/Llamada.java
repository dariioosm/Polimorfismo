package llamadas;

public abstract class Llamada {
    private String origen;
    private String desetino;
    private int duracion;

    public abstract int calcularCoste();
}
