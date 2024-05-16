package llamadas;

import java.util.ArrayList;
import java.util.Iterator;

public class LlamadaList {
    ArrayList <Llamada> listin= new ArrayList<Llamada>();

    public void cargarLlamadas(){

        listin.add( new LlamadaEstandar("98 5112233","98 5332211",10));
        listin.add(new LlamadaEstandar("98 5112233","98 1234567",15));
        listin.add(new LlamadaHoraria("98 5112233","91 3333333",5,"Y22"));
        listin.add(new LlamadaHoraria("98 5112233","91 5555555",13,"C44"));
        listin.add(new LlamadaHoraria("98 5112233","91 5555555",2,"A11"));
        listin.add(new LlamadaHoraria("98 5112233","91 5555555",33,"R11"));

    }
    public void verListin(){
        for (Llamada llamadas : listin) {
            System.out.println(llamadas);
        }
    }

    public void borrarLlamada(){
        Iterator<Llamada> iterador = listin.iterator();
        while (iterador.hasNext()) {
            Llamada llamada = iterador.next();
            if (llamada.equals(llamada)) {
                iterador.remove();
                System.out.println("Llamada eliminada: " + llamada);
            }
        }
    }
    
}
