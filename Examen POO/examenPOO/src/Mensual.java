public class Mensual extends Contrato{

    private String cargo;
    private int horasTotales;
    private double salario;

    public Mensual(Persona persona, int duracion, String inicioActividad, boolean sellado, String cargo, int horasTotales, double salario) {
        super(persona, duracion, inicioActividad, sellado);
        this.cargo = cargo;
        this.horasTotales = horasTotales;
        this.salario = salario;
    }
    public boolean esJefe(){
        String j="jefe";
        return cargo.equals(j);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public boolean sePuedeIncorporar() {
        return super.sePuedeIncorporar();
    }
}
