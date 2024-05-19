package llamadas;

public class LlamadaHoraria extends Llamada {

    private String franjaHoraria;

    public LlamadaHoraria(String numOrigen, String numDestino, int duracion, String franjaHoraria) {
        super(numOrigen, numDestino, duracion);
        this.franjaHoraria = franjaHoraria;
    }

    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setFranjaHoraria(String franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

    public double calcularCoste() {
        String[] franjas = { "A11", "B11", "C44", "R11", "Y22" };
        double preciomedio;
        double tmp = 0;
        double valores[][] = {
                { 0.20, 0.30, 0.40 },
                { 0.10, 0.40, 0.50 },
                { 0.30, 0.50, 0.70 },
                { 1.22, 1.90, 1.98 },
                { 2.21, 2.25, 2.98 }
        };

        for (int i = 0; i < 5; i++) {

            if (franjas[i].equals(franjaHoraria)) {
                for (int j = 0; j < valores[i].length; j++) {

                    tmp += valores[i][j];
                }

            }

        }
        preciomedio = tmp / 3;

        double coste = preciomedio * duracion;

        return coste;

    }
}
