public class EmpleadoMarketing extends Empleado{

    private String area;

    @Override
    public void trabajar() {
        System.out.println("Empleado de marketing "+ getNombre() + " trabajando en " + );
    }
}
