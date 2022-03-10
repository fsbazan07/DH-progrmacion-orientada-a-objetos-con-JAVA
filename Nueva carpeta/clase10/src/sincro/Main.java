package sincro;

public class Main {
    public static void main(String[] args) {
        Socio s1= new Socio("A001","Rodolfo","Gimnasio",1400);
        System.out.println(s1.toString());
        System.out.println("Hashcode: "+s1.hashCode());
        System.out.println("Cuota a pagar: "+s1.cuotaMensual());
        Socio s2= new Socio("A001","Ezequiel","Gimnasio",1400);
        System.out.println("Son iguales s1 y s2: "+s1.equals(s2));
        SocioHabilitado s3= new SocioHabilitado("A002","Ezequiel","Gimasio",1400,500);
        s3.toString();
        System.out.println("Cuota a pagar: "+s3.cuotaMensual());
        s3.setHabilitado(true);
        System.out.println("Cuota a pagar: "+s3.cuotaMensual());
    }
}
