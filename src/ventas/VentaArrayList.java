package ventas;

import java.util.*;

import llamadas.Llamada;

import java.io.*;

public class VentaArrayList {

    ArrayList<Venta> ventas = new ArrayList<>();
    ArrayList<NuevoFichero>ventas2= new ArrayList<>();
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
            System.out.println("Error en la entrada o salida de datos: " + e.getMessage());
        }
    }

    public void leerFichero() {
        try (ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream("ventasrb.dat"))) {
            while (true) {
                System.out.println(ventas2);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe. ");
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero: " + e.getMessage());
        }
    }
}
