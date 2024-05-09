package selccionfutbol;

public abstract class SeleccionFutbol {
    protected String nombre,apellidos;
    protected int id,edad;
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void SeleccionFutbol(int id,String nombre, String apellidos, int edad) {
       super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.edad = edad;
    }

    public void viajar(){
        System.out.println("Viajar clase padre");
    }

    public void concentrarse(){
        System.out.println("Concentrarse clase padre");
    }
    public abstract void entrenamiento();

    public void partidoFutbol(){
        System.out.println("Asiste al partido de futbol clase padre");
    }
}
