package videoclub;

public class Videojuego {
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

    
}
