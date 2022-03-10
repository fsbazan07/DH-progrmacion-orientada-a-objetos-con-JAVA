package mesas;

public class Nave extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }
    public void girar(char direccion){
        setDireccion(direccion);
    }
    public void restarVida(int valor){
        if (vida-valor<0){
            vida=0;
        }
        else{
            vida=vida-valor;
        }
    }
    @Override
    public void irA(int x, int y, char direccion){
        if (this.getDireccion()!=direccion){
            girar(direccion);
        }
        setPosx(x);
        setPosy(y);
    }

    @Override
    public int hashCode() {
        int hash=31;
        hash=hash*Integer.hashCode(getPosx())*Integer.hashCode(getPosy())*Double.hashCode(velocidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null)
            return false;
        if (!(obj instanceof Nave))
            return false;
        else
            return getPosx()==((Nave)obj).getPosx()&&(getPosy()==((Nave)obj).getPosy())&&(getDireccion()==((Nave)obj).getDireccion());
    }

    @Override
    public String toString() {
        return "Soy una Nave en x: "+getPosx()+", y= "+getPosy()+" con dirección a "+getDireccion();
    }
}
