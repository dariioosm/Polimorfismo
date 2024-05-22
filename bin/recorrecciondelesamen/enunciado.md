Crear un proyecto java, cuyo nombre sea:  ApellidoNombre.

Crea una clase “Venta” con los siguientes atributos: 
    String idproducto; 
    double precio; 
    int cantidad;
    String marca.

 Dicha clase tiene un método abstracto para el cálculo del beneficio. 
 
Crea dos clases hijas de “Venta” llamadas “VentaOnline” con los atributos
    String metodoPago; 
    String direccionEnvio 

Clase “VentaLocal” con atributos 
    String vendedor;
    String ubicación.

Crea un ArrayList de objetos “Venta” que permita almacenar ventas de ambos tipos.

Crear un método que permita cargar varias ventas de ambos tipos por programa, mínimo 5, tener en cuenta las marcas.

Crea una clase con método “main” que permita realizar a través de un menú las siguientes opciones:
    
    1)	Método para agregar nuevas ventas tanto “VentaOnline” como “VentaLocal”. Se debe validar la marca. marcasRopa = {"Nike", "Adidas", "Zara", "H&M", "GAP"}

    2)	Método “buscarVentas” que acepte el id de un producto y devuelva todos los datos de las ventas de ese producto, tanto “locales” como “online”.

    3)	Método que grabe todas las ventas en un fichero.

    4)	Método que lea el fichero y realice un informe de ventas por marca. Debe de figurar el total de unidades por marca y el beneficio que aporta dicha marca. El importe del beneficio obtenido por cada venta en función del tipo de venta “VentaOnline” o  “VentaLocal” y de la marca se calcula: (precio x cantidad) x porcentaje.
    marcasRopa = {"Nike", "Adidas", "Zara", "H&M", "GAP"}
    porcentajes_ventasOnline = {0.11, 0.15, 0.23, 0.25, 0.31}
    porcentajes_ventasLocal = {0.02, 0.05, 0.10, 0.20, 0.28}

    Utilizar las estructuras de datos adecuadas (Arrays).

    Por ejemplo, la salida podría ser:
    Nike 	Total unidades: 10   	Beneficio:20000
    Adidas 	Total unidades: 33	Beneficio: 33333
…
    5)	Finalizar.

	Codificar los programas en Java POO. Crear las clases y métodos adecuados.
	Crear y utilizar la clase reserva y sus clases hijas.
	Entrada de datos por teclado. Visualización de resultados por pantalla.
	Utilizar las estructuras de datos adecuadas. 
	Codificar correctamente el tratamiento de las estructuras de datos.
	Utilizar ficheros de datos. Codificar excepciones.
	El programa debe de funcionar en su totalidad.

	
