package empleados;

public class EmpleadoDestajo extends Empleado{
    private int clientesCaptados;
    public static final float salarioD = 130.05f;

    public EmpleadoDestajo(){
        super();
        clientesCaptados=0;
    }

    public EmpleadoDestajo(String dni, String nombre, String apellidos, int fechaIngreso, int clientesCaptados){
        super(dni,nombre,apellidos, fechaIngreso);
        this.clientesCaptados=clientesCaptados;
    }




    

    @Override
    public float getSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSalario'");
    }
}
