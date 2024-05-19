package llamadas;

public class Main {
    public static void main(String[] args) {
        LlamadaList list = new LlamadaList();
        list.cargar();
        list.mostrar();
        list.eliminarLlamadasDestino();
    }
}
