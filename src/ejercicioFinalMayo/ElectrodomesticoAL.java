package ejercicioFinalMayo;

import java.util.*;

public class ElectrodomesticoAL {
    ArrayList<Electrodomestico> ventas = new ArrayList<Electrodomestico>();

    public void cargaLista() {
        ventas.add(new Television(500, 10, 'E', "negro", 42, false));
        ventas.add(new Television(200, 20, 'C', "naranja", 30, true));
        ventas.add(new Lavadora(600, 20, 'D', "gris", 10));
        ventas.add(new Lavadora(300, 40, 'Z', "blanco", 40));
        ventas.add(new Lavadora(400, 60, 'A', "verde", 15));
    }

    public void imprimeLista() {
        for (Electrodomestico electrodomestico : ventas) {
            System.out.println(electrodomestico);
        }
    }

}
