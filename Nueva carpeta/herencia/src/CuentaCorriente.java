public class CuentaCorriente extends Cuenta{
    private double descubierto=1000.00;

    public CuentaCorriente(double numero, double saldo, double descubierto) {
        super(numero, saldo);
        this.descubierto = descubierto;
    }

    @Override
    public double extraer(double importe) {
        return super.setSaldo()+descubierto;
    }
}
