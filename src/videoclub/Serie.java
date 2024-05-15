package videoclub;

public class Serie {
    private String titulo;
    private int temporadas;
    private String genero;
    private String creador;
    private boolean entregado;
    
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

    public boolean isEntregado() {
        return entregado;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public Serie(){

    }
    
    public Serie(String titulo, int temporadas, String genero, String creador, booelan entregado) {
        this.titulo = titulo;
        this.temporadas = 3;
        this.genero = genero;
        this.creador = creador;
        this.entregado=false;
    }

    public Serie(String titulo,int temporadas, String genero, String creador){
        this.titulo=titulo;
        this.temporadas= temporadas;
        this.genero=genero;
        this.creador=creador;

    }
    
}
