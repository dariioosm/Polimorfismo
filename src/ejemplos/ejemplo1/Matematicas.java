package ejemplos.ejemplo1;

public class Matematicas {
    public static void main(String[] args) {
        Figura f1 = new Circulo(3);
        Figura f2= new Rectangulo(2, 4);
        System.out.println("El area del circulo es: "+f1.calcularPerimetro());
        System.out.println("El area del rectangulo es: "+f2.calcularPerimetro());
    }
    
}
