package ventas;

public class VentaRedBull extends Venta {

    private String tipoEntrada;
    private int numeroEntradas;
    



    public String getTipoEntrada() {
        return tipoEntrada;
    }




    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }




    public int getNumeroEntradas() {
        return numeroEntradas;
    }




    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }

    


    public VentaRedBull(String tipoEntrada, int numeroEntradas) {
        this.tipoEntrada = tipoEntrada;
        this.numeroEntradas = numeroEntradas;
    }




    public VentaRedBull(String fechaHora, String evento, String tipoEntrada, int numeroEntradas) {
        super(fechaHora, evento);
        this.tipoEntrada = tipoEntrada;
        this.numeroEntradas = numeroEntradas;
    }




    @Override
    public String toString() {
        return super.toString()+ "VentaRedBull [tipoEntrada=" + tipoEntrada + ", numeroEntradas=" + numeroEntradas + "]";
    }




    @Override
    public double calcularIngresoVenta() {
        int[]precio={350,250,100,60};
        String[]tipo={"SP","GP","GA","EG"};
        double ingreso=0;
        for(int i=0; i<tipo.length;i++){
            if(getTipoEntrada().equalsIgnoreCase(tipo[i])){
                ingreso=getNumeroEntradas()*precio[i];
            }
        }
        return ingreso;
    }
    
}
