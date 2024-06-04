package banquito;

public class Menu {
    public static void main(String[] args) {
        CuentaArrayList cuenta = new CuentaArrayList();
        cuenta.cargarLista();
        cuenta.verLista();
        cuenta.grabaFichero();
        cuenta.leeFichero();
    }

}
