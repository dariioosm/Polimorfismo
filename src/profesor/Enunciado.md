Ejercicio Profesor (Polimorfismo)

▪ Declara una clase abstracta Profesor con los atributos:
    private String nombre;✅
    private String apellidos;✅
    private int edad;✅
    private String IdProfesor;✅
▪ Declara un método abstracto: importeNomina().✅

▪ Crea dos clases concretas que hereden de Profesor: la clase ProfesorTitular y la clase
ProfesorInterino que sobreescriban los métodos abstractos necesarios. Calculo nomina:
    ✓ 30 x 43,20 (Profesor Titular)
    ✓ 30 x 35,60 (Profesor Interino)

▪ Crea una lista de profesores (ArrayList).

▪ Codifica la clase Test donde creamos profesores interinos y profesores titulares (ya que
    Profesor es una clase abstracta, no instanciable) y los vamos añadiendo a la lista.

▪ Posteriormente, invocamos el método imprimirListin(), que se basa en los métodos toString
    de las subclases y visualiza todos sus datos incluida la nomina y al método
    importeTotalNominaProfesorado() , ambos métodos pertenecen a la clase Test.

▪ Grabar en un fichero el IdProfesor y su nómina, para lo cual se debe crear un ArrayList de la
clase nomina.

▪ Datos:
    ProfesorInterino pi1 = new ProfesorInterino("José", "Hernández López", 45,”45221887-K");
    ProfesorInterino pi2 = new ProfesorInterino("Andrés", "Moltó Parra", 38, "72332634-L");
    ProfesorInterino pi3 = new ProfesorInterino ("José", "Ríos Mesa", 56, "34998128-M");
    ProfesorTitular pt1 = new ProfesorTitular ("Juan", "Pérez Pérez", 23, "73-K");
    ProfesorTitular pt2 = new ProfesorTitular ("Alberto", "Centa Mota", 49, "88-L");
    ProfesorTitular pt3 = new ProfesorTitular ("Maria", "Mota Pérez", 39, "81-F");