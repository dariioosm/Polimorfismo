package llamadas;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LlamadaList {

    static ArrayList<Llamada> llamadas = new ArrayList<Llamada>();

    public void cargar() {
        llamadas.add(new LlamadaEstandar("98 5112233", "98 5332211", 10));
        llamadas.add(new LlamadaEstandar("98 5112233", "98 1234567", 15));
        llamadas.add(new LlamadaHoraria("98 5112233", "91 3333333", 5, "Y22"));
        llamadas.add(new LlamadaHoraria("98 5112233", "91 5555555", 13, "C44"));
        llamadas.add(new LlamadaHoraria("98 5112233", "91 5555555", 2, "A11"));
        llamadas.add(new LlamadaHoraria("98 5112233", "91 5555555", 33, "R11"));

    }

    public void mostrar() {

        for (int a = 0; a < llamadas.size(); a++) {
            System.out.println(llamadas.get(a).getNumOrigen() + " " + llamadas.get(a).getNumDestino()
                    + " " + llamadas.get(a).getDuracion() + " " + llamadas.get(a).calcularCoste());
        }

    }

    public void calcFactura() {
        Scanner sc = new Scanner(System.in);
        int cuota;
        System.out.print("Introduce la cuota: ");
        cuota = sc.nextInt();

        for (int a = 0; a < llamadas.size(); a++) {
            System.out.println(llamadas.get(a).calcularCoste() + " + " + "cuota" + " = "
                    + (llamadas.get(a).calcularCoste() + cuota));
        }

    }

    public static void guardarArrayList() {
        try {
            ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream("FileLlamadas.dat"));
            ficheroSalida.writeObject(llamadas);

            ficheroSalida.close();
            System.out.println("LLAMADAS guardadas correctamente...");

        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: El fichero no existe. ");
        } catch (IOException ioe) {
            System.out.println("Error: Fallo en la escritura en el fichero. ");
        }

    }

    public static void cargarArrayList() {
        try {
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream("FileLlamadas.dat"));
            ArrayList<Llamada> llamadas = (ArrayList<Llamada>) ficheroEntrada.readObject();

            System.out.println("Datos cargados correctamente...");

            for (Llamada llamada : llamadas) {
                if (llamada instanceof LlamadaHoraria) {
                    LlamadaHoraria llamadaHoraria = (LlamadaHoraria) llamada;
                    System.out.println("Llamada Horaria:");
                    System.out.println("Numero de origen: " + llamada.getNumOrigen());
                    System.out.println("Numero de destino: " + llamada.getNumDestino());
                    System.out.println("Duracion: " + llamada.getDuracion());
                    System.out.println("Franja horaria: " + llamadaHoraria.getFranjaHoraria());
                    System.out.println();
                }
            }

            ficheroEntrada.close();

        } catch (ClassNotFoundException cnfe) {
            System.out.println(
                    "No se pudo acceder a la clase adecuada para revertir la Serializacion al leer del fichero.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe. ");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Error: Fallo en la lectura del fichero. ");
        }
    }

    public void eliminarLlamadasDestino() {
        Scanner sc = new Scanner(System.in);
        String numeroDestino;
        System.out.println("Introduce el numero de destino para eliminar: ");
        numeroDestino = sc.nextLine();
        Iterator<Llamada> iterator = llamadas.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Llamada llamada = iterator.next();
            if (llamada.getNumDestino().equals(numeroDestino)) {
                iterator.remove();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron llamadas al numero de destino: " + numeroDestino);
        }
    }

}
