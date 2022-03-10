package presencial;

public class Feliz implements Estado{
    private Tamagochi t;

    public Feliz(Tamagochi t){
        this.t=t;
        System.out.println("Feliz");
    }

    @Override
    public void comer() {

    }

    @Override
    public void beber() {
        System.out.println("Beep. Beep. Beep. Beep. Beep");
    }

    @Override
    public void recibirMimos() {

    }
}
