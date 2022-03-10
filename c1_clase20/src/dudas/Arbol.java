package dudas;

public class Arbol {
    private String nombre;
    private int vida;

    public Arbol(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void corte(int danio){
        if (vida-danio>=0){
            vida-=danio;
        }
        else{
            vida=0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString(){
        return "Vida del árbol llamado: "+getNombre()+": "+getVida();
    }
}
