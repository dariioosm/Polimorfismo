package selccionfutbol;

public class Masajista {
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


    @Override
    public void entrenamiento(){
        System.out.println("Asiste al entreno clase masajista");
    }

    @Override
    public void darMasaje(){
        System.out.println("Da un masaje");
    }
    
}
