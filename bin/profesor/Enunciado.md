Declara una clase Profesor con los atributos:
    String IdProfesor;✅✅✅
    String nombre;✅✅✅
    String apellidos;✅✅✅
    Double Sueldo base;✅✅✅

Crea dos clases que hereden de Profesor:
     Clase ProfesorTitular:
     Complemento de destino (numérico real): 500 euros.✅✅✅
     Antigüedad en trienios (numérico entero).✅✅✅
        o 1 trienio 1.01 del salario
        o 2 trienios 1.02
        o 3 trienios 1.05
        o 4 trienios 1.06
        o 5 trienios 1.07
        o 6 trienios 1.08
 Clase ProfesorInterino:
     Complemento específico 600 euros.
Crea una lista de profesores (ArrayList).

Codifica la clase Test donde creamos profesores interinos y profesores titulares y los vamos
añadiendo a la lista.

    ProfesorInterino pi1 = new ProfesorInterino("José", "Hernández López","45221887-K",1789);
    ProfesorInterino pi2 = new ProfesorInterino("Andrés", "Moltó Parra", "72332634-L",1200);
    ProfesorInterino pi3 = new ProfesorInterino ("José", "Ríos Mesa", "34998128-M",1800);
    ProfesorTitular pt1 = new ProfesorTitular ("Juan", "Pérez Pérez", "73-K",1900,2);
    ProfesorTitular pt2 = new ProfesorTitular ("Alberto", "Centa Mota", "88-L",1800,3);
    ProfesorTitular pt3 = new ProfesorTitular ("Maria", "Mota Pérez", "81-F",1700,5);
Declara un método importeNomina().

Posteriormente, invocamos el método imprimirListin(), que se basa en los métodos toString de
las subclases y visualiza todos sus datos incluida la nómina.

Grabar en un fichero el IdProfesor y su nómina, para lo cual se debe crear un ArrayList de la
clase nómina.

Por ultimo el método importeTotalNominaProfesorado() leerá el archivo grabado y calcula la
suma de todas las nóminas.