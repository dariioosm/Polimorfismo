package Reservas;

public class ReservaVuelo extends Reserva {

    private String origen;
    private String destino;

    public ReservaVuelo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ReservaVuelo(String nombreCliente, int numeroDias, double precioBase, int numeroPersonas) {
        super(nombreCliente, numeroDias, precioBase, numeroPersonas);
        // TODO Auto-generated constructor stub
    }

    public ReservaVuelo(String nombreCliente, int numeroDias, double precioBase, int numeroPersonas, String origen,
            String destino) {
        super(nombreCliente, numeroDias, precioBase, numeroPersonas);
        this.origen = origen;
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Vuelo\n" + super.toString() + "\nOrigen: " + origen + "\nDestino: " + destino;
    }

}
