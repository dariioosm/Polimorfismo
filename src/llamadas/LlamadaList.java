package llamadas;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LlamadaList {

    static ArrayList<Llamada> listin = new ArrayList<>();

    public void cargarLlamadas() {
        listin.add(new LlamadaEstandar("98 5112233", "98 5332211", 10));
        listin.add(new LlamadaEstandar("98 5112233", "98 1234567", 15));
        listin.add(new LlamadaHoraria("98 5112233", "91 3333333", 5, "Y22"));
        listin.add(new LlamadaHoraria("98 5112233", "91 5555555", 13, "C44"));
        listin.add(new LlamadaHoraria("98 5112233", "91 5555555", 2, "A11"));
        listin.add(new LlamadaHoraria("98 5112233", "91 5555555", 33, "R11"));
    }

    public void verListin() {
        for (int v = 0; v < listin.size(); v++) {
            System.out.println(listin.get(v).getOrigen() + " " + listin.get(v).getDestino() + " "
                    + listin.get(v).getDuracion() + " " + listin.get(v).calcularCoste());
        }
    }

    public void calcularFactura() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la cuota: ");
        double cuota = in.nextDouble();
        double totalCoste = 0;

        for (Llamada llamada : listin) {
            totalCoste += llamada.calcularCoste();
        }

        totalCoste += cuota;
        System.out.println("Coste total de todas las llamadas: " + totalCoste + "€ (incluye cuota de " + cuota + "€)");
    }

    public void guardarRegistro() {
        try (ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream("registro.dat"))) {
            ficheroSalida.writeObject(listin);
            System.out.println("Se han guardado las llamadas en el registro");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la entrada o salida de datos");
        }
    }

    public static void cargarListin() {
        try (ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream("registro.dat"))) {
            listin = (ArrayList<Llamada>) ficheroEntrada.readObject();
            System.out.println("Se han cargado las llamadas correctamente");
            for (Llamada llamada : listin) {
                if (llamada instanceof LlamadaHoraria) {
                    LlamadaHoraria llamaH = (LlamadaHoraria) llamada;
                    System.out.println("-----Llamadas horarias-----\n");
                    System.out.println("Numero de origen: " + llamada.getOrigen());
                    System.out.println("Numero de destino: " + llamada.getDestino());
                    System.out.println("Duracion: " + llamada.getDuracion());
                    System.out.println("Franja Horaria: " + LlamadaHoraria.getFranja());
                    System.out.println();
                }
            }
            ficheroEntrada.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada");
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error en la entrada o salida de datos");
        }
    }

    public void borrarLlamada() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el numero que desees eliminar: ");
        String borra = in.nextLine();
        boolean existe = false;
        Iterator<Llamada> iterador = listin.iterator();
        while (iterador.hasNext()) {
            Llamada llamada = iterador.next();
            if (llamada.getDestino().equals(borra)) {
                iterador.remove();
                System.out.println("Llamada eliminada: " + llamada);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No existe este numero " + borra + " como destino");
        }
    }
}
