public class Main {

    public static void main(String[] args) {

        Empleado miempleado = new Empleado("juan", "perez", 123.20, 23.20, "ab123456");
        System.out.println("Sueldo a cobrar: $"+ miempleado.calcularSueldo());
        System.out.println("Sueldo a cobrar con premio: $" + miempleado.calcularSueldo(50.00));

        Vendedor vendedor1= new Vendedor("alvaro", "GP", 125.00, 25, "vd12345", 12, 145.50);
        System.out.println(vendedor1 + " cobra $"+ vendedor1.calcularSueldo());

    }
}
