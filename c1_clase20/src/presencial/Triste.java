package presencial;

public class Triste implements Estado {
    private Tamagochi t;

    public Triste(Tamagochi t){
        this.t=t;
        System.out.println("Triste");
    }

    @Override
    public void comer() {
        System.out.println("Beep. Beep. Vomitando");
    }

    @Override
    public void beber() {
        System.out.println("Beep. Beep. Beep. Display titilando");
    }

    @Override
    public void recibirMimos() {
        t.setEstado(new Feliz(t));
    }
}
