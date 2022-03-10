package dudas;

public class Personaje {
    private String nombre;
    private static Personaje instance;

    private Personaje(String nombre){
        this.nombre=nombre;
    }

    public static Personaje getInstance(){
        if (instance==null){
            instance= new Personaje("Rodolfo");
        }
        return instance;
    }

    public void atacarArbol(Arbol arbol){
        arbol.corte(50);
    }
}
