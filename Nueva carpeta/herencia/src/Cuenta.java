public class Cuenta {
    private double numero;
    private double saldo;

    public Cuenta(double numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double depositar(double importe){
    return saldo+=importe;
    }

    public double extraer(double importe){
        if (saldo<=importe){
            return saldo-=importe;
        }
        return void;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }}
