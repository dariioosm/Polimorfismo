package ejercicioFinalMayo;

public class Lavadora extends Electrodomestico {

    private int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora() {

    }

    public Lavadora(double precioBase, int peso, char letra, String colores, int carga) {
        super(precioBase, peso, letra, colores);
        this.carga = carga;
    }

    @Override
    public void comprobarConsumoEnergetico() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprobarConsumoEnergetico'");
    }

    @Override
    public void comprobarColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprobarColor'");
    }

    @Override
    public double precioFinal() {
        char[] consumo = { 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] pInicio = { 100, 80, 60, 50, 30, 10 };
        int temporal = -1;
        int precio = 0;
        for (int i = 0; i < consumo.length; i++) {
            if (consumo[i] == letra) {
                temporal = pInicio[i];
            }
        }
        if (temporal != -1) {
            if (peso >= 0 && peso <= 19) {
                precio = temporal + 10;
            } else if (peso > 19 && peso <= 49) {
                precio = temporal + 50;
            } else if (peso > 49 && peso <= 79) {
                precio = temporal + 80;
            } else if (peso > 79) {
                precio = temporal + 100;
            }
        } else {
            System.out.println("Letra de consumo no valida");
        }
        return precio;
    }

}
