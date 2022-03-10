public class EmpleadoFactory {
    private static EmpleadoFactory instance;

    private EmpleadoFactory(){

    }
    public static EmpleadoFactory getInstance(){
        if (instance==null){
            instance= new EmpleadoFactory();
        }
        return instance;
    }


    public Empleado crearEmpleado(String tipo){
        Empleado resultado=null;
        switch (tipo){
            case "EMP-INT":
                resultado= new EmpleadoRelacionDependencia();
                ((EmpleadoRelacionDependencia)resultado).setSueldoMensual(1000);
                break;
            case "EMP-EXT":
                resultado= new EmpleadoContratado();
                ((EmpleadoContratado)resultado).setImportePorHora(7);
                ((EmpleadoContratado)resultado).setRetencionImpuesto(0.14);
                break;
        }
        return resultado;
    }
}
