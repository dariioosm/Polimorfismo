package ventas;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class VentaArrayList {

<<<<<<< HEAD
    ArrayList<Venta> ventas = new ArrayList<Venta>();
    ArrayList<NuevoFichero> ventas2 = new ArrayList<NuevoFichero>();

=======
    ArrayList<Venta> ventas = new ArrayList<>();
    ArrayList<NuevoFichero>ventas2= new ArrayList<>();
>>>>>>> 5766385e804076bde8677b459243fc8764fe132c
    public void rellenaList() {
        ventas.add(new VentaRedBull("22Julio24:0023:00", "RedBull8", "GP", 1000));
        ventas.add(new VentaRedBull("23Julio24:0023:00", "RedBull9", "GA", 3000));
        ventas.add(new VentaRedBull("24Julio24:0023:00", "RedBull8", "SP", 2000));
        ventas.add(new VentaRedBull("25Julio24:0023:00", "RedBull9", "EG", 5000));
        ventas.add(new VentaRedBull("27Julio24:0023:00", "RedBull8", "EG", 2000));
    }

    public void cargaLista() {
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

    public void calculaVentas() {
        for (Venta calculo : ventas) {
            System.out.println("El ingreso de ventas de: " + calculo.getEvento() + " es de: "
                    + calculo.calcularIngresoVenta());
        }
    }

    public void borraVenta() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca nombre del evento que quiera eliminar");
        String borraEvento = in.nextLine();
        Iterator<Venta> it = ventas.iterator();
        while (it.hasNext()) {
            Venta venta = it.next();
            if (venta.getEvento().equalsIgnoreCase(borraEvento)) {
                it.remove();
            }
        }
    }

    public void grabaFichero() {

        
        for (NuevoFichero lista : ventas2) {
            ventas2.add( new NuevoFichero(lista.getFechaHora(),lista.getIngreso()));
        }

        try (ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream("ventasrb.dat"))) {
            for (NuevoFichero lista : ventas2) {
                ficheroSalida.writeObject(ficheroSalida);;
            }
            System.out.println("Fichero escrito correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }

    public void leerFichero() {

        try (ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream("ventasrb.dat"))) {
            while (true) {
                System.out.println(ventas2);

            }
            System.out.println("Contenido leído correctamente del fichero");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("No se pudo acceder a la clase adecuada para revertirlo.");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: el fichero no existe.");
        } catch (IOException ioe) {
            System.out.println("Error de entrada/salida: " + ioe.getMessage());
        }
    }
}
