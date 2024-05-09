package selccionfutbol;

public abstract class SeleciconFutbol {
    protected String nombre,apellidos;
    protected int id,edad;
    
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
