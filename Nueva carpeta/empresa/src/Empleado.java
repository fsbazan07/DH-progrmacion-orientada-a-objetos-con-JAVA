public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;

    public void trabajar(){
        System.out.println("Empleado "+ nombre + " trabajando");
    }
    public void descansar(){
        System.out.println("Empleado "+ nombre + " descansando");
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
