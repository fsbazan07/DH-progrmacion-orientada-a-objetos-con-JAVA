public class Chofer {
    private String nombre;
    private String apellido;
    private Auto auto;

    public Chofer(String nombre, String apellido, Auto auto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }
    public String verPatente(){
        return auto.getPatente();
    }
    public String quienEsChofer(){
        return getApellido() + " " + getNombre();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}
