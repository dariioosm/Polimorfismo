package selccionfutbol;


public class Futbolista extends SeleciconFutbol    {
    private int dorsal;
    private String  demarcacion;

    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    


    public Futbolista( int id,String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, apellidos, nombre, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    @Override
    public void entrenamiento(){
        System.out.println("Realiza un entrenamiento clase futbolista");
    }
    @Override
    public void partidoFutbol(){
        System.out.println("Juega partido de futbol clase futbolista");
    }
    
    
    public void entrevista(){
        System.out.println("Jugador da una entrevista");
    }   
}
