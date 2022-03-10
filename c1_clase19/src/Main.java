public class Main {
    public static void main(String[] args) {
        EmpleadoRelacionDependencia rodolfo= (EmpleadoRelacionDependencia) EmpleadoFactory.getInstance().crearEmpleado("EMP-INT");
        Empleado ezequiel= EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        //error EmpleadoFactory ef= new EmpleadoFactory();

        Empresa empresa= new Empresa("Digital");
        Empleado emp1 =  EmpleadoFactory.getInstance().crearEmpleado("EMP-INT");
        emp1.setNombre("Juan");
        emp1.setApellido("Rodriguez");
        ((EmpleadoRelacionDependencia)emp1).setSueldoMensual(10000);

        Empleado emp2 = EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        emp2.setNombre("Juan");
        emp2.setApellido("Rodriguez");

        empresa.getEmpleados().add(emp1);
        empresa.getEmpleados().add(emp2);

        double totalSueldo = empresa.calcularSueldoTotal(25);

        System.out.println("Total de Sueldos abonados: ");
        System.out.println(totalSueldo);
    }
}
