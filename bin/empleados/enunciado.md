                                        EMPLEADOS

▪ Declara una clase abstracta EMPLEADO con los atributos: ✅✅✅
    private String dni;
    private String nombre;
    private String apellidos;
    protected LocalDate fechaIngreso;

▪ Declara un método abstracto: float getSalario. ✅✅✅

▪ Crea dos clases concretas que hereden de Empleado: la clase EContratado (salario) y
    la clase EDestajo ( salarioD=130.05; nº de clientes). ✅✅✅

▪ Crea una lista de empleados (ArrayList).

▪ Codifica la clase Test donde creamos empleados y los vamos añadiendo a la lista.

▪ Los datos se introducen por teclado y se añaden al ArrayList.

▪ El salario se calcula:
    ✓ EContratado. Según antigüedad en años:
    - 1 año 1.01 del salario
    - 2 años 1.02
    - 3 años 1.05
    - 4 años 1.06
    - 5 años 1.07
    - 6 años 1.08
    - 7 años 1.10
    - 8 años 1.11
    - 9 años 1.12
    - 10 años 1.13
    - 11 años 1.14
    - 12 años 1.15
    - Otros 1.20 del salario.
    
    ✓ EDestajo. Salario destajo por nº de clientes.

▪ Crear un menú que permita realizar lo siguiente:
 1.Registrar empleados contratados.
 2. Registrar empleados a destajo.
 3. Mostrar salarios por empleado.
 4. Eliminar empleados.
 5.Grabar empleados.
 6. Salir