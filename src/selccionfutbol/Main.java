package selccionfutbol;


import java.util.ArrayList;

public class Main {
    public static ArrayList<SeleccionFutbol>integrante= new ArrayList<SeleccionFutbol>();
    public static void main(String[] args) {
        SeleccionFutbol delBosque= new Entrenador() {1,"Vicente","Del Bosque",60,28489};
        SeleccionFutbol iniesta= new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez= new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);
    
    }
}
