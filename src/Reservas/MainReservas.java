package Reservas;

import java.util.*;

import java.io.*;

public class MainReservas {

    public static void cargarReservas(ArrayList<Reserva> ar) {
        ar.add(new ReservaHotel("Luis", 6, 90, 2, "Hotel Paco", "Madrid"));
        ar.add(new ReservaHotel("Raul", 10, 400, 4, "Hotel Saul", "Barcelona"));
        ar.add(new ReservaVuelo("Silvia", 8, 200, 1, "Budapest", "Madrid"));
        ar.add(new ReservaHotel("Maria", 13, 70, 2, "Hotel Juan", "Salamanca"));
        ar.add(new ReservaVuelo("Juan", 19, 941, 3, "Viena", "Londres"));
        ar.add(new ReservaHotel("Marta", 6, 90, 4, "Hotel Paco", "Madrid"));
    }

    public static void cargarReservasTeclado(ArrayList<Reserva> ar) {
        int op;
        int[] diasv = { 6, 8, 10, 13, 16, 19 };
        int d;
        double pr;
        int pe;
        boolean t = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Que deseas registrar?\n1-Una reserva de hotel\n2-Una reserva de vuelo\nOpcion: ");
            op = sc.nextInt();
            sc.nextLine();
            if (op != 1 && op != 2) {
                System.out.println("Error, la opcion escogida no existe");
            }
        } while (op != 1 && op != 2);

        System.out.print("Introduce el nombre del cliente: ");
        String nom = sc.nextLine();
        do {

            System.out.print("Introduce los dias de estancia (6,8,10,13,16,19): ");
            d = sc.nextInt();
            for (int di : diasv) {
                if (d == di) {
                    t = false;
                }
            }
            if (t) {
                System.out.println("Error, introduce un numero de dias de los valores propuestos");
            }
        } while (t);
        sc.nextLine();
        do {
            System.out.print("Introduce el precio base: ");
            pr = sc.nextInt();
            if (pr <= 0) {
                System.out.println("Error, precio positivo");
            }
        } while (pr <= 0);
        do {
            System.out.print("Introduce el numero de personas: ");
            pe = sc.nextInt();
            if (pe <= 0) {
                System.out.println("Error, introduce un numero de personas positivo");
            }
        } while (pe <= 0);
        sc.nextLine();
        if (op == 1) {
            System.out.print("Introduce el nombre del hotel: ");
            String nomh = sc.nextLine();
            System.out.print("Introduce la ubicacion del hotel: ");
            String ubi = sc.nextLine();
            ar.add(new ReservaHotel(nom, d, pr, pe, nomh, ubi));
        } else {
            System.out.print("Introduce el origen del vuelo: ");
            String or = sc.nextLine();
            System.out.print("Introduce destino del vuelo: ");
            String des = sc.nextLine();
            ar.add(new ReservaVuelo(nom, d, pr, pe, or, des));
        }
        System.out.println("---------------------------");
    }

    public static void buscarReserva(ArrayList<Reserva> ar) {
        Scanner sc = new Scanner(System.in);
        boolean existe = false;
        System.out.print("Introduce el nombre del cliente a buscar: ");
        String nom = sc.nextLine();
        for (Reserva a : ar) {
            if (a.getNombreCliente().equals(nom)) {
                System.out.println(a.toString());
                existe = true;
                System.out.println("---------------------------");
            }
        }
        if (!existe) {
            System.out.println("No hay ningun cliente con el nombre introducido");
        }

    }

    public static void grabarReservas(ArrayList<Reserva> ar) throws FileNotFoundException, IOException {
        ObjectOutputStream fac = new ObjectOutputStream(new FileOutputStream("Reservas.dat"));
        try {
            for (Reserva a : ar) {
                fac.writeObject(a);
            }
            System.out.println("Fichero grabado con exito");
            System.out.println("---------------------------");
        } catch (IOException ex) {
            System.out.println("Error en la escritura del fichero");
        } finally {
            try {
                fac.close();

            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }

    public static void leerReservas() throws IOException, ClassNotFoundException {
        Reserva a;
        FileInputStream fin = new FileInputStream("Reservas.dat");
        ObjectInputStream fent = new ObjectInputStream(fin);
        try {
            while ((a = (Reserva) fent.readObject()) != null) {
                if (a instanceof Reserva) {
                    System.out.println(a.toString());
                    System.out.println("---------------------------");
                }

            }
        } catch (EOFException ex) {

        } catch (IOException ex) {
            System.out.println("Error en la lectura del fichero");
        } finally {
            try {
                fent.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }

    public static void leerReservasHotel() throws IOException, ClassNotFoundException {
        Reserva a;

        int c;
        Hotel ho;
        boolean t;
        ArrayList<Hotel> h = new ArrayList<Hotel>();
        FileInputStream fin = new FileInputStream("Reservas.dat");
        ObjectInputStream fent = new ObjectInputStream(fin);
        try {
            while ((a = (Reserva) fent.readObject()) != null) {
                if (a instanceof ReservaHotel) {
                    Iterator it = h.iterator();

                    c = 0;
                    if (it.hasNext()) {
                        t = false;
                        while (it.hasNext()) {
                            ho = (Hotel) it.next();
                            if (ho.getNombre().equals(((ReservaHotel) a).getNombreHotel())) {
                                ho.setPersonas(ho.getPersonas() + a.getNumeroPersonas());
                                t = true;
                            }
                        }
                        if (!t) {
                            h.add(new Hotel(((ReservaHotel) a).getNombreHotel(), a.getNumeroPersonas()));
                        }
                    } else {
                        h.add(new Hotel(((ReservaHotel) a).getNombreHotel(), a.getNumeroPersonas()));
                    }
                }

            }
        } catch (EOFException ex) {

        } catch (IOException ex) {
            System.out.println("Error en la lectura del fichero");
        } finally {
            try {
                fent.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero");
            }
        }
        for (Hotel hot : h) {
            System.out.println(hot.toString());
            System.out.println("---------------------------");
        }
        h = null;

    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Reserva> ar = new ArrayList<Reserva>();
        cargarReservas(ar);
        int op = 0;
        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.print(
                        "Que deseas hacer?\n1-Introducir nuevas reservas\n2-Buscar reservas por cliente\n3-Grabar las reservas en un fichero/Actualizar el fichero\n4-Leer todas las reservas del fichero\n5-Ver cuantas personas se alojaran en cada hotel registrado en el fihero\n6-Finalizar el programa\nOpcion: ");
                op = sc.nextInt();
                if (op < 1 || op > 6) {
                    System.out.println("Error, la opcion seleccionada no existe");
                }
            } while (op < 1 || op > 6);
            System.out.println("---------------------------");
            switch (op) {
                case 1:
                    cargarReservasTeclado(ar);
                    break;
                case 2:
                    buscarReserva(ar);
                    break;
                case 3:
                    grabarReservas(ar);
                    break;
                case 4:
                    leerReservas();
                    break;
                case 5:
                    leerReservasHotel();
                    break;
                case 6:
                    System.out.println("Fin del programa");
                    break;
            }
        } while (op != 6);
    }
}
