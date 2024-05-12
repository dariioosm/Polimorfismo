package profesor;

import java.util.ArrayList;

public class Test {
    ArrayList<ProfesorInterino> colegio1 = new ArrayList<ProfesorInterino>();
    ArrayList<ProfesorTitular> colegio = new ArrayList<ProfesorTitular>();

    public void cargaArray() {
        ProfesorInterino pi1 = new ProfesorInterino("José", "Hernández López", 0, "45221887-K", 1789);
        ProfesorInterino pi2 = new ProfesorInterino("Andrés", "Moltó Parra", 0, "72332634-L", 1200);
        ProfesorInterino pi3 = new ProfesorInterino("José", "Ríos Mesa", 0, "34998128-M", 1800);
        ProfesorTitular pt1 = new ProfesorTitular("Juan", "Pérez Pérez", 0, "73-K", 1900, 2, 0);
        ProfesorTitular pt2 = new ProfesorTitular("Alberto", "Centa Mota", 0, "88-L", 1800, 3, 0);
        ProfesorTitular pt3 = new ProfesorTitular("Maria", "Mota Pérez", 0, "81-F", 1700, 5, 0);

        colegio1.add(pi1);
        colegio1.add(pi2);
        colegio1.add(pi3);
        colegio.add(pt1);
        colegio.add(pt2);
        colegio.add(pt3);
    }

    public static void main(String[] args) {
        Test test = new Test(); // Create an instance of Test class
        test.cargaArray(); // Call cargaArray method to populate the ArrayLists

        System.out.println("Profesor Interino:");
        for (ProfesorInterino interino : test.colegio1) {
            System.out.println(interino);
        }

        System.out.println("Profesor Titular:");
        for (ProfesorTitular titular : test.colegio) {
            System.out.println(titular);
        }
    }
}
