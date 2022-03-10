public class PorHora extends Contrato implements Comparable{
    private int horasContratadas;
    private double valorHora;

    public PorHora(Persona persona, int duracion, String inicioActividad, boolean sellado, int horasContratadas, double valorHora) {
        super(persona, duracion, inicioActividad, sellado);
        this.horasContratadas = horasContratadas;
        this.valorHora = valorHora;

    }

    public int getHorasContratadas() {
        return horasContratadas;
    }

    public void setHorasContratadas(int horasContratadas) {
        this.horasContratadas = horasContratadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int compareTo(Object o) {
        PorHora contratoPorHora=(PorHora) o;
        int resp=0;
        double contratoPorHora1=getHorasContratadas();
        double contratoPorHora2=contratoPorHora.getHorasContratadas();
        if (contratoPorHora1>contratoPorHora2) resp = 1;

        if (contratoPorHora1<contratoPorHora2) resp = -1;
        return resp;
    }

    @Override
    public boolean sePuedeIncorporar() {
        return super.sePuedeIncorporar();
    }
}
