package videoclub;

public class Videojuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getHorasEstimadas() {
        return horasEstimadas;
    }
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    

    public Videojuego(){

    }

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo=titulo;
        this.horasEstimadas=10;
        
    }
    @Override
    public void entregar() {
    }
    @Override
    public void devolver() {
    }
    @Override
    public boolean isEntregado() {
    }

    
}
