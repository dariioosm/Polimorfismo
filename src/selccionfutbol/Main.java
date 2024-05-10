package selccionfutbol;

import java.util.ArrayList;

public class Main {
    public static ArrayList<SeleccionFutbol> integrante = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrante.add(delBosque);
        integrante.add(iniesta);
        integrante.add(raulMartinez);

        System.out.println("Todos los integrantes comienzan la concentracion. Todos ejecutan el mismo metodo");
        for (SeleccionFutbol integrantes : integrante) {
            System.out.println(integrantes.getNombre() + " " + integrantes.getApellidos() + " -> ");
            integrantes.viajar();
        }
        System.out.println(
                "\n" + "Planificar Entrenamiento: Solo el entrenador tiene el metodo para planificar un entreno");
        System.out.println(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
        ((Entrenador) delBosque).planificaEntreno();
        System.out.println("\n" + "Entrevista: Solo el futbolista tiene el metodo para dar una entrevista: ");
        System.out.println(iniesta.getNombre() + " " + iniesta.getApellidos() + " ->");
        ((Masajista) raulMartinez).darMasaje();

    }
}
