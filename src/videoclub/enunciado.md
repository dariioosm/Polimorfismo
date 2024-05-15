                                Ejercicio Videoclub

1. Crear una clase llamada Serie con las siguientes características:

    · Sus atributos son titulo, numero de temporadas, entregado, genero y
    creador.

    · Por defecto, el número de temporadas es de 3 temporadas y entregado false. El
    resto de atributos serán valores por defecto según el tipo del atributo.

    · Los constructores que se implementaran serán:
             Un constructor por defecto.
             Un constructor con el titulo y creador. El resto por defecto.
             Un constructor con todos los atributos, excepto de entregado.
    
    · Los métodos que se implementara serán:
    
             Métodos get de todos los atributos, excepto de entregado.
             Métodos set de todos los atributos, excepto de entregado.
             Sobrescribe los métodos toString.

2. Crearemos una clase Videojuego con las siguientes características:
    
    · Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    · Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de
    atributos serán valores por defecto según el tipo del atributo.

    · Los constructores que se implementaran serán:

             Un constructor por defecto.
             Un constructor con el titulo y horas estimadas. El resto por defecto.
             Un constructor con todos los atributos, excepto de entregado.

    · Los métodos que se implementara serán:
    
             Métodos get de todos los atributos, excepto de entregado.
             Métodos set de todos los atributos, excepto de entregado.
             Sobrescribe los métodos toString.

3. Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en
    común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:
    
    · entregar(): cambia el atributo prestado a true.
    · devolver(): cambia el atributo prestado a false.
    · isEntregado(): devuelve el estado del atributo prestado.

4. Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una
aplicación ejecutable y realiza lo siguiente:

    · Crea dos Array , uno de Series y otro de Videojuegos.
    · Crea objetos, con los valores que desees.
    · Entrega algunos Videojuegos y Series con el método entregar().
    · Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
    
        Podéis probar estos datos:
    //Creamos dos arrays de cada tipo de objeto
        Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];
    
    //Creamos un objeto en cada posicion del array
        listaSeries[0]=new Serie("La casa de papel",1,"Thriller", "Pedro Moran");
        listaSeries[1]=new Serie("Juego de tronos", "George R. R.Martin ");
        listaSeries[2]=new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
        listaSeries[3]=new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
        listaSeries[4]=new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
        listaVideojuegos[0]=new Videojuego("Splatoon 2",20);
        listaVideojuegos[1]=new Videojuego("Assasin creed 2", 30,"Aventura", "EA");
        listaVideojuegos[2]=new Videojuego("God of war 3", 45);
        listaVideojuegos[3]=new Videojuego("Super Mario 3DS", 30,"Plataforma","Nintendo");
        listaVideojuegos[4]=new Videojuego("Final fantasy X", 200,"Rol", "Square Enix");

    //entregamos algunos videojuegos y series
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();
    
    //Recorremos los arrays para contar cuantos entregados hay,tambien los devolvemos
