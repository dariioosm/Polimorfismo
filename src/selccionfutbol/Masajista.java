package selccionfutbol;

public class Masajista extends SeleciconFutbol {
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

    

    
    public Masajista(String nombre, String apellidos, int id, int edad,String titulacion, int experiencia) {
        super(nombre,apellidos,id,edad);
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }
    @Override
    public void entrenamiento(){
        System.out.println("Asiste al entreno clase masajista");
    }

    
    public void darMasaje(){
        System.out.println("Da un masaje");
    }
    
}
