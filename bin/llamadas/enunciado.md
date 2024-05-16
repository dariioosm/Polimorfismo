Desarrollar una aplicación de control de llamadas telefónicas.

Se  registran las llamadas. Registrar una llamada consiste en añadirla a un ArrayList.

Todas las llamadas tienen como datos el número de origen de la llamada (alfanumérico), el número de destino (alfanumérico) y la duración en minutos (entero).

Crear clase “Llamada” y las clases derivadas que se consideren necesarias, con sus constructores y métodos. Hay dos tipos de llamadas:

Llamada “Estándar”, atributos: establecimiento de llamada (0.25€).

Llamada “Horaria”, atributos: franja-horaria.


	Crea el método calcularCoste(). 

Existen dos tipos de llamadas:

    Llamadas “Estandar” que cuestan por 0.29  x duración + 0.25 de establecimiento de llamada.

Llamadas “Horaria” que dependiendo de la franja horaria en la que se realice cuestan el valor medio de los precios que figuran en esta matriz (precio_medio) x duración: 

Crear una aplicación Java que realice lo siguiente, utilizando métodos y POO:

	Cargar las siguientes  llamadas en el  ArrayList:

    LlamadaEstandar("98 5112233","98 5332211",10)
    LlamadaEstandar("98 5112233","98 1234567",15)
    LlamadaHoraria("98 5112233","91 3333333",5,Y22)
    LlamadaHoraria("98 5112233","91 5555555",13,C44)
    LlamadaHoraria("98 5112233","91 5555555",2,A11)
    LlamadaHoraria("98 5112233","91 5555555",33,R11)

	Crear un menú, con las siguientes opciones:

	Mostrar todos los datos de cada llamada junto con su coste.
	Calcular la factura telefónica: coste total de todas las llamadas + cuota (introducida por teclado). Visualizar los datos correctamente etiquetados.

	Grabar las llamadas en un fichero.

	Leer las llamadas grabadas en el fichero y visualizar solo las “Horaria”.

	Eliminar todas las llamadas realizadas a un determinado número de destino. En caso de no existir, visualizar el correspondiente mensaje.


	Utilizar las estructuras de datos adecuadas. 
	Al menos en uno de los métodos se debe de utilizar Iterator.
	Los programas deben de funcionar en su totalidad.
	Codificar los programas en Java POO. Crear las clases adecuadas.
	Crea un proyecto Java en Eclipse cuya denominación sea 1ºapelidoNombre_3Eva. Comprime dicho proyecto (solución a entregar).
