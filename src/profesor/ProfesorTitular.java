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

    public ProfesorTitular(String nombre, String apellidos, int edad, String idProfesor, double sueldo,
            double complementoDestino, int trienio) {
        super(nombre, apellidos, edad, idProfesor, sueldo);
        this.complementoDestino = complementoDestino;
        this.trienio = trienio;

    }

    public void importeTotal(int trienio) {

        System.out.println();
    }

    @Override
    public void importeNomina() {
        int[] anno = { 1, 2, 3, 4, 5, 6 };
        double[] prima = { 1.01, 1.02, 1.05, 1.06, 1.07, 1.08 };
        double mensualidad = 30 * 43.20;
        double total = 0;
        double todo = total + getComplementoDestino();
        for (int i = 0; i < anno.length; i++) {
            if (trienio == anno[i]) {
                total = (super.getSueldo() * prima[i]) + super.getSueldo();
            }
        }
        System.out.println("El sueldo sin trienios es: " + mensualidad + "\n" + "Sueldo con trienio incluido: " + total
                + "\n" + "Sueldo con todos los extras: " + todo);

    }
}
