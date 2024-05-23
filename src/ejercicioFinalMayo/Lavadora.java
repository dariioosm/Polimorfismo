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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'precioFinal'");
    }
}
