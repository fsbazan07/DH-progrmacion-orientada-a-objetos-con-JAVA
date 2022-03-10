package sincro;

public class SocioHabilitado extends Socio {
    private double ingresoPileta;
    private boolean habilitado;

    public double getIngresoPileta() {
        return ingresoPileta;
    }

    public void setIngresoPileta(double ingresoPileta) {
        this.ingresoPileta = ingresoPileta;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public SocioHabilitado(String numero, String nombre, String actividad, double cuota, double costoIngreso) {
        super(numero, nombre, actividad, cuota);
        ingresoPileta = costoIngreso;
    }

    @Override
    public double cuotaMensual(){
        double cuota=getCuotaMensual();
        if (estaHabilitado())
            cuota+=ingresoPileta;
        return cuota;
    }
    public boolean estaHabilitado(){
        return habilitado;
    }
}
