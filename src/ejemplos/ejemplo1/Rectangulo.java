package ejemplos.ejemplo1;

public class Rectangulo  extends Figura{
private double base,altura;
Rectangulo(double b,double h){
base=b;
altura=h;
}

@Override
public double calcularPerimetro(){
    return 2*base+2*altura;
}
    
}