package Reservas;

public class ReservaHotel extends Reserva {

    private String nombreHotel;
    private String ubicacionHotel;

    public ReservaHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ReservaHotel(String nombreCliente, int numeroDias, double precioBase, int numeroPersonas) {
        super(nombreCliente, numeroDias, precioBase, numeroPersonas);
        // TODO Auto-generated constructor stub
    }

    public ReservaHotel(String nombreCliente, int numeroDias, double precioBase, int numeroPersonas, String nombreHotel,
            String ubicacionHotel) {
        super(nombreCliente, numeroDias, precioBase, numeroPersonas);
        this.nombreHotel = nombreHotel;
        this.ubicacionHotel = ubicacionHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getUbicacionHotel() {
        return ubicacionHotel;
    }

    public void setUbicacionHotel(String ubicacionHotel) {
        this.ubicacionHotel = ubicacionHotel;
    }

    @Override
    public String toString() {
        return "Hotel\n" + super.toString() + "\nNombre del hotel: " + nombreHotel + "\nUbicacion del hotel: "
                + ubicacionHotel;
    }

}
