package ventas;

public class NuevoFichero extends Venta {

private String fechaHora;









    @Override
    public double calcularIngresoVenta() {

        int[] precio = { 350, 250, 100, 60 };
        String[] tipo = { "SP", "GP", "GA", "EG" };
        double ingreso = 0;
        for (int i = 0; i < tipo.length; i++) {
            if (getTipoEntrada().equalsIgnoreCase(tipo[i])) {
                ingreso = getNumeroEntradas() * precio[i];
            }
        }
        return ingreso;
    }

}
