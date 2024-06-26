package videoclub;

public class Serie  implements Entregable{
    private String titulo;
    private int temporadas;
    private String genero;
    private String creador;
    private boolean isEntregado;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }

    

    public Serie(){

    }
    
    public Serie(String titulo, int temporadas, String genero, String creador, boolean isEntregado) {
        this.titulo = titulo;
        this.temporadas = 3;
        this.genero = genero;
        this.creador = creador;
        this.isEntregado=false;
    }

    public Serie(String titulo,int temporadas, String genero, String creador){
        super();
        this.titulo=titulo;
        this.temporadas= temporadas;
        this.genero=genero;
        this.creador=creador;

    }

    @Override
    public String toString() {
        return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", genero=" + genero + ", creador=" + creador
                + ", isEntregado=" + isEntregado + "]";
    }
    @Override
    public void entregar() {
        }
    @Override
    public void devolver() {
        }
    
}
