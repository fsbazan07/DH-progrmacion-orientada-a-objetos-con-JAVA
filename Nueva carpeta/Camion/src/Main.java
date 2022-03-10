public class Main {
    public static void main (String[] args){
    Camion miCamion = new Camion("Scania", "AA123AA");
    Camion.cambiarPrecioCombustible(102.50);
        System.out.println("Gasto $" + miCamion.gastoCombustible(40));
    }
}

