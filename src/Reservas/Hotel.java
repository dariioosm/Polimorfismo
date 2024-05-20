package Reservas;

public class Hotel {
    private String nombre;
    private int personas;

    public Hotel() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Hotel(String nombre, int personas) {
        super();
        this.nombre = nombre;
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return nombre + " - Personas=" + personas;
    }

}
