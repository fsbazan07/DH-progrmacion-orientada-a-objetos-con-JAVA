package presencial;

public class Tamagochi {
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Tamagochi(){
        estado= new Triste(this);
    }
    //acciones
    public void comer(){
        estado.comer();
    }
    public void beber(){
        estado.beber();
    }
    public void recibirMimos(){
        estado.recibirMimos();
    }
}
