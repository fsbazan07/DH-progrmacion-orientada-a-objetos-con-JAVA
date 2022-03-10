package presencial;

public class Sediento implements Estado{
    private Tamagochi t;

    public Sediento (Tamagochi t){
        this.t=t;
        System.out.println("Sediento");
    }

    @Override
    public void comer() {

    }

    @Override
    public void beber() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void recibirMimos() {

    }
}
