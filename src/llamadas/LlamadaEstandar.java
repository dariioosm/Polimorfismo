package llamadas;

public class LlamadaEstandar extends Llamada {

    private final double establecimiento = 0.25;
    private final double prima = 0.29;

    public LlamadaEstandar() {
        super();
    }

    public LlamadaEstandar(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    public double getEstablecimiento() {
        return establecimiento;
    }

    public double getPrima() {
        return prima;
    }

    @Override
    public double calcularCoste() {
        double estandar = (getPrima() * getDuracion()) + getEstablecimiento();
        System.out.println("El precio de esta llamada estandar con duracion " + duracion +
                "es de " + estandar + " euros");
        return estandar;
    }

}
