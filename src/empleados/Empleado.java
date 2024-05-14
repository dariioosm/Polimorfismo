package empleados;

public abstract class  Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    protected int fechaIngreso;

    public abstract float getSalario();

}
