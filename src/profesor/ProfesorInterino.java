package profesor;

public class ProfesorInterino extends Profesor {

    public ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor, double sueldo) {
        super(nombre, apellidos, edad, idProfesor, sueldo);

    }

    @Override
    public void importeNomina() {
        double mensualidad = 30 * 35.60;
        double total = mensualidad + 600;
        System.out.println("El sueldo del profesor interino sin extras es: " + mensualidad + "\n"
                + "El sueldo del interino incuyendo extras es: " + total);
    }
}
