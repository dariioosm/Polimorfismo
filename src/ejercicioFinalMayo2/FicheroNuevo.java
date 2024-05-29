package ejercicioFinalMayo2;

import java.io.*;
import java.util.*;

public class FicheroNuevo {
    private ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

    public void grabarPreciosYPesos() {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("productos2.dat"))) {
            for (Electrodomestico electrodomestico : electrodomesticos) {
                salida.writeObject(electrodomestico);
            }
            System.out.println("Datos grabados en productos2.dat correctamente.");
        } catch (IOException e) {
            System.err.println("Error al grabar en productos2.dat: " + e.getMessage());
        }
    }

    public void leerPreciosYPesos() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("productos2.dat"))) {
            while (true) {
                try {
                    Electrodomestico electrodomestico = (Electrodomestico) entrada.readObject();
                    electrodomesticos.add(electrodomestico);
                    System.out.println("Precio Base: " + electrodomestico.getPrecioBase() + ", Peso: "
                            + electrodomestico.getPeso());
                } catch (EOFException e) {
                    break; // Sale del bucle cuando llega al final del archivo
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde productos2.dat: " + e.getMessage());
        }
    }
}
