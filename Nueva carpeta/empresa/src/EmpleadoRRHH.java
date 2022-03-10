public class EmpleadoRRHH extends Empleado{
    private int altasLogradas;

    @Override
    public void trabajar() {
        System.out.println("Empleado de RRHH "+ getNombre() + " trabajando");
    }
}
