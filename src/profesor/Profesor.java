package profesor;

public abstract class Profesor {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected String IdProfesor;
    protected double sueldo;


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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getIdProfesor() {
        return IdProfesor;
    }
    public void setIdProfesor(String idProfesor) {
        IdProfesor = idProfesor;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Profesor(String nombre, String apellidos, int edad, String idProfesor,double sueldo) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.IdProfesor = idProfesor;
        this.sueldo=sueldo;
    }

    public abstract void importeNomina();

}
