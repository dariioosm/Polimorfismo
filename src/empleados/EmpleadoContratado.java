package empleados;

public class EmpleadoContratado extends Empleado {
    private float salarioC;
   
    
   
   
   
      
    @Override
    public float getSalario() {
        double[]prima={1.01,1.02,1.05,1.06,1.07,1.08,1.10,1.11,1.12,1.13,1.14,1.15};
        float total=0;
        int  annos = 2024-getFechaIngreso();    
        if (annos<12){
            for(int i=0; i<prima.length;i++){
                total=(float) (getSalario()+(getSalario()*prima[i]));
            }    
        }
        else{
                total=(float) (getSalario()+(getSalario()*1.20));
            }
            System.out.println("El sueldo final para la antiguedad de "+annos+" es: "+total);
            return total;
            
        }
    }
    

