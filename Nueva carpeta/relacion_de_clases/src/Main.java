public class Main {
     public static void main(String[] args){

         Chofer chofer= new Chofer("Alex", "Puchuy", new Auto("AA123AA",
                 "Fiat", "128"));
         Auto auto= new Auto("BB233DD", "Fiat", "147");
         System.out.println("Patente auto asignado: " + chofer.verPatente() + " a " + chofer.quienEsChofer());
     }

}
