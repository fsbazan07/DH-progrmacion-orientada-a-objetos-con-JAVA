public abstract class Contrato {
    private Persona persona;
    private int duracion;
    private String inicioActividad;
    private boolean sellado;

    public Contrato(Persona persona, int duracion, String inicioActividad, boolean sellado) {
        this.persona = persona;
        this.duracion = duracion;
        this.inicioActividad = inicioActividad;
        this.sellado = sellado;
    }
    public boolean sePuedeIncorporar(){
        return sellado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getInicioActividad() {
        return inicioActividad;
    }

    public void setInicioActividad(String inicioActividad) {
        this.inicioActividad = inicioActividad;
    }

    public boolean isSellado() {
        return sellado;
    }

    public void setSellado(boolean sellado) {
        this.sellado = sellado;
    }
}
