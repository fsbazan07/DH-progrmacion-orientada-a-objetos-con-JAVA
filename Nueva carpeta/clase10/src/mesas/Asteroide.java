package mesas;

public class Asteroide extends Objeto{
    private int lesion;

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char direccion){
        setPosx(x);
        setPosy(y);
    }

    @Override
    public int hashCode() {
        int hash=31;
        hash=hash*Integer.hashCode(getPosx())*Integer.hashCode(getPosy())*Integer.hashCode(lesion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null)
            return false;
        if (!(obj instanceof Asteroide))
            return false;
        else
            return getPosx()==((Asteroide) obj).getPosx()&&(getPosy()==((Asteroide)obj).getPosy());
    }

    @Override
    public String toString() {
        return "Soy un asteroide en x: "+getPosx()+", y= "+getPosy()+" con lesion igual a "+lesion;
    }
}
