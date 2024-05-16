package llamadas;

public class LlamadaHoraria extends Llamada {
    private String franja;



    @Override
    public double calcularCoste() {
        double [][] tarifas={{0.20,0.30,0.40},
                            {0.10,0.40,0.50},
                            {0.30,0.50,0.70},
                            {1.22,1.90,1.88},
                            {2.21,2.25,2.89}};
        String [] tipo={"A11","B11","C44","R11","Y22"};
        /*
         * ? el tipo selecciona la horizontal de la tarifa
         * 
         * se supone que tiene que recorrer la fila 
         */
        for(int i= 0; i< tarifas.length;i++){
            if(franja.equals(tipo)){
                for(int j=0; j<tarifas[i].length;j++){
                    
                }
            }
        }

        return 0;
    }
}
