package empleados;

public abstract class  Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    protected int fechaIngreso;

    public Empleado(){
        super();
    }

    public Empleado(String dni, String nombre, String apellidos, int fechaIngreso) {
        super();
    }

    public abstract float getSalario();

}
