package llamadas;

public class LlamadaHoraria extends Llamada {
    private String franja;
    
    public String getFranja() {
        return franja;
    }



    public void setFranja(String franja) {
        this.franja = franja;
    }



    public LlamadaHoraria(String franja) {
        this.franja = franja;
    }



    public LlamadaHoraria(String origen, String desetino, int duracion, String franja) {
        super(origen, desetino, duracion);
        this.franja = franja;
    }



    @Override
    public double calcularCoste() {
        int fila=0;
        double suma=0;
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
        /* bucle para llegar a la altura de la tarifa */
        
         for(int i= 0; i< tarifas.length;i++){
            if(franja.equals(tipo[i])){
                 fila =i;
            }
        }
            /*bucle para recorrer la fila de la tarifa y conseguir el total */
        for(int j=0; j<tarifas[0].length;j++){
                
                suma =suma+tarifas[fila][j];    
            
            }
                
            
            double total= suma/3;
            System.out.println("El precio medio de la tarifa "+tipo[fila]+" es: "+total);
            return total;
        }



    }

    

