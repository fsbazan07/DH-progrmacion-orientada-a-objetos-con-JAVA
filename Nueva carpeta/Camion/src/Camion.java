public class Camion {
    private String marca;
    private String patente;
    static private double valorCombustible;

    public Camion(String marca, String patente) {
        this.marca = marca;
        this.patente = patente;
    }

    public double gastoCombustible(int litros) {
        return litros * Camion.valorCombustible;
    }

    static public void cambiarPrecioCombustible(double precio) {
        Camion.valorCombustible = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}