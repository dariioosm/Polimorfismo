package llamadas;

public class LlamadaEstandar extends Llamada {

    private double establecimiento=0.25;
    private double prima=0.29;
    
    
    @Override
    public double calcularCoste() {
        double estandar= (prima*duracion)+establecimiento;
        System.out.println("El precio de esta llamada estandar con duracion "+duracion+
            "es de "+estandar+" euros");
        return estandar;
        }
    
}
