package ejemplos.ejemplo1;

public class Circulo extends Figura {
    private double radio;

    Circulo(double r){
        radio=r;
    }
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
