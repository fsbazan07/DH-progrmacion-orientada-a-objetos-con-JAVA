package presencial;

public class Hambriento implements Estado {
    private Tamagochi t;

    public Hambriento (Tamagochi t){
        this.t=t;
        System.out.println("Hambriento");
    }

    @Override
    public void comer() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void beber() {

    }

    @Override
    public void recibirMimos() {

    }
}
