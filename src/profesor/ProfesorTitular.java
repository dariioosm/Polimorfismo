package profesor;

public class ProfesorTitular extends Profesor {
    private double complementoDestino;
    private int trienio;

    public double getComplementoDestino() {
        return complementoDestino;
    }

    public void setComplementoDestino(double complementoDestino) {
        this.complementoDestino = complementoDestino;
    }

    public int getTrienio() {
        return trienio;
    }

    public void setTrienio(int trienio) {
        this.trienio = trienio;
    }

    public ProfesorTitular(String nombre, String apellidos, int edad, String idProfesor, double sueldo,double complementoDestino, int trienio){
        super(nombre, apellidos, edad, idProfesor, sueldo);
        this.complementoDestino=complementoDestino;
        this.trienio=trienio;

    }


    @Override
    public void importeNomina() {
        double mensualidad = 30 * 43.20;
        System.out.println("El sueldo sin trienios es: " + mensualidad);

    }

}
