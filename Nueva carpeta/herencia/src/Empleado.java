public class Empleado  extends Persona {

    private double sueldo;
    private double descuento;
    private String legajo;

    public Empleado(String nombre, String apellido, double sueldo, double descuento, String legajo) {
        super(nombre, apellido);
        this.sueldo = sueldo;
        this.descuento = descuento;
        this.legajo = legajo;

    }

    public double calcularSueldo() {
        return sueldo - descuento;
    }

    public double calcularSueldo(double premio) {
        return sueldo - descuento + premio;
    }
}