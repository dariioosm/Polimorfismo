package empleados;

public class EmpleadoContratado extends Empleado {
    private float salarioC;
   
    /*calcular antiguedad en la empresa*/
    

    public void calculaNomina(){
        
        double[]prima={1.01,1.02,1.05,1.06,1.07,1.08,1.10,1.11,1.12,1.13,1.14,1.15};
        double total=0;
        int  annos = 2024-getFechaIngreso();    
        if (){
            
        }
        for (int i =0; i<prima.length;i++){
            if(annos<12){
                total=(getSalario()*prima[i]);
            }
            else{
                total=(getSalario()*1.20);
            }
        }
    
    }
   
   
   
      
    @Override
    public float getSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSalario'");
    }
    
}
