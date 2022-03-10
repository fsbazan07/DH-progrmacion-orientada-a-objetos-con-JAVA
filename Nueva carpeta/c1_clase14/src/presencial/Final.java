package presencial;

public class Final extends Examen implements Comparable {
    private double notaOral;
    private String temaOral;

    public Final(String titulo, String enunciado, double nota, Alumno alumno, double notaOral, String temaOral) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }


    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getTemaOral() {
        return temaOral;
    }

    public void setTemaOral(String temaOral) {
        this.temaOral = temaOral;
    }

    @Override
    public int compareTo(Object o) {
        Final otroFinal=(Final)o;
        int resp=0;
        double promedioMio=(getNota()+notaOral)/2;
        double promedioOtro=(otroFinal.getNota()+ otroFinal.getNotaOral())/2;
        if (promedioMio>promedioOtro){
            resp=1;
        }
        if (promedioMio<promedioOtro) {
            resp = -1;
        }
        return resp;
    }

    @Override
    public boolean estaAprobado(){
        return getNota()>4&&notaOral>4;
    }
}
