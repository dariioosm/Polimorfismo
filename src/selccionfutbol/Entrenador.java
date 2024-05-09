package selccionfutbol;

public class Entrenador extends SeleciconFutbol {
    private int idFederacion;

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(String nombre, String apellidos, int id, int edad, int idFederacion) {
        super(id, apellidos, nombre, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void entrenamiento(){
        System.out.println("Dirige entrenamiento clase entrenador");
    }

    @Override
    public void partidoFutbol(){
        System.out.println("Dirige un partido clase entrenador");
    }
    
    public void planificaEntreno(){
        System.out.println("Planifica un entrenamiento");
    }
}
