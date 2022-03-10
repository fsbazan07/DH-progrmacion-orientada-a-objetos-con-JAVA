public class Vendedor extends Empleado{
    private int comision;
    private double importeVentas;

    public Vendedor(String nombre, String apellido, double sueldo, double descuento, String legajo, int comision, double importeVentas) {
        super(nombre, apellido, sueldo, descuento, legajo);
        this.comision=comision;
        this.importeVentas=importeVentas;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public double getImporteVentas() {
        return importeVentas;
    }

    public void setImporteVentas(double importeVentas) {
        this.importeVentas = importeVentas;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo()+importeVentas/100*comision;
    }
}
