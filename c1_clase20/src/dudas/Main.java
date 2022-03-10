package dudas;

public class Main {
    public static void main(String[] args) {
        Arbol elGranArbol= new Arbol("El Gran Árbol",1000);
        System.out.println(elGranArbol);
        Personaje.getInstance().atacarArbol(elGranArbol);
        System.out.println(elGranArbol);
    }
}
