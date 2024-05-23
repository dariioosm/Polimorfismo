package recorrecciondelesamen;

import java.util.*;
import java.io.*;
public class VentaArrayList {
    ArrayList<Venta> inventario = new ArrayList<Venta>();
	
	public void cargar() {
		inventario.add(new VentaOnline("Z1",50,8,"Zara","Visa","Madrid"));
		inventario.add(new VentaOnline("A1",80,1,"Adidas","American Express","Gijon"));
		inventario.add(new VentaOnline("N1",180,1,"Nike","MasterCard","Nueva York"));
		inventario.add(new VentaTienda("H1",390,1,"H&M","Juan","Aviles"));
		inventario.add(new VentaTienda("G1",500,1,"GAP","Andrea","Valencia"));
	}

	public void annadeVenta(){
		Scanner in= new Scanner(System.in);
		String[] marcasRopa = { "Nike", "Adidas", "Zara", "H&M", "GAP" };
        System.out.println("Introduce el codigo de la venta a annadir");
        String cod = in.nextLine();
		while (inventario.get(idProducto).equals(cod)) {
			
		}
	}






}
