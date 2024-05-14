package profesor;
import java.io.*;
public class Nomina implements Serializable {
    /*
     * Grabar en un fichero el IdProfesor y su nómina, para lo cual se debe crear un
     * ArrayList de la
     * clase nómina.
     */
    private String IdProfesor;
    private float Nomina;
    
    public Nomina(String idProfesor, float nomina){
        IdProfesor= idProfesor;
        Nomina=nomina;
    }

    public Nomina(){

    }
    @Override
    public String toString(){
        return  super.toString();
    }
    

}