package empleados;

public abstract class  Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    protected int fechaIngreso;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Empleado(){
        super();
    }

    public Empleado(String dni, String nombre, String apellidos, int fechaIngreso) {
        super();
    }

    public abstract float getSalario();

}
