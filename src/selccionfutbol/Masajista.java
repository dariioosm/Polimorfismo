package selccionfutbol;

public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int experiencia;

    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    

    
    public Masajista(int id,String nombre, String apellidos, int edad,String titulacion, int experiencia) {
        super(id,apellidos,nombre,edad);
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }
    
    public void entrenamiento(){
        System.out.println("Asiste al entreno clase masajista");
    }

    
    public void darMasaje(){
        System.out.println("Da un masaje");
    }
    
}
