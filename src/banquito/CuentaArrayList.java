package banquito;

import java.util.*;

import personalSanitario.Hospitalario;
import personalSanitario.Sanitario;
import java.io.*;

public class CuentaArrayList {
    ArrayList<Cuenta> clientes = new ArrayList<Cuenta>();
    ArrayList<Cuenta> clientes2 = new ArrayList<Cuenta>();

    public void cargarLista() {
        clientes.add(new Plazos("4j5j56j", "Juan Carlos", 4567, 1000, 8));
        clientes.add(new Plazos("88EW23", "Maria", 100, 10, 8));
        clientes.add(new Plazos("876ERF", " Carlos", 45, 1, 11));
        clientes.add(new Plazos("345DFTG", "Juan", 95457, 2000, 20));
        clientes.add(new Plazos("098AAA", "Antonio", 4, 1000, 9));
    }

    public void verLista() {
        for (Cuenta cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void grabaFichero() {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("ListaClientes.dat"))) {

            salida.writeObject(clientes);
            salida.close();

            System.out.println("Personal guardado exitosamente en ListaClientes.dat");
        } catch (IOException e) {
            System.out.println("Error al grabar en ListaClientes.dat: " + e.getMessage());
        }
    }

    public void leeFichero() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("ListaClientes.dat"))) {
            clientes2 = (ArrayList<Cuenta>) entrada.readObject();
            for (Cuenta cliente : clientes2) {
                Plazos pla = (Plazos) cliente;
                if (pla.calculaInteres() > 100) {
                    System.out.println("Codigo de cuenta " + pla.getCodigo() + " Intereses generados "
                            + pla.calculaInteres());
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encuentra la clase");
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error en entrada o salida de datos");
        }
    }

}
