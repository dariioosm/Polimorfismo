package llamadas;

public class LlamadaHoraria extends Llamada {
    



    @Override
    public double calcularCoste() {
        double [][] tarifas={{0.20,0.30,0.40},
                            {0.10,0.40,0.50},
                            {0.30,0.50,0.70},
                            {1.22,1.90,1.88},
                            {2.21,2.25,2.89}};
        for(int i=0;i<tarifas.length;i++){
            for(int j=0;j<tarifas[i].length;j++){
                
            }
        }

        return 0;
    }
}
