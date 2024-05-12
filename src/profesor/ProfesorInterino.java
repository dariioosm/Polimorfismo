package profesor;

public class ProfesorInterino extends Profesor {

    private static final int dias = 30;
    private static final int extras = 600;
    private static final double saldo = 35.60;

    public ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor, double sueldo) {
        super(nombre, apellidos, edad, idProfesor, sueldo);

    }

    @Override
    public void importeNomina() {
        double mensualidad = dias * saldo;
        double total = mensualidad + extras;
        System.out.println("El sueldo del profesor interino sin extras es: " + mensualidad + "\n"
                + "El sueldo del interino incuyendo extras es: " + total);
    }
}
