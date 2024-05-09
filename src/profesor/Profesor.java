package profesor;

public abstract class Profesor {
    private String nombre;
    private String apellidos;
    private int edad;
    private String IdProfesor;
    
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

    public Profesor(String nombre, String apellidos, int edad, String idProfesor) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.IdProfesor = idProfesor;
    }

    public  void importeNomina(){
        
    }


}
