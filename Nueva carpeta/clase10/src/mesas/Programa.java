package mesas;

public class Programa extends Object{
    public static void main(String[] args) {
        Nave n1= new Nave(100,100,'N',100);
        System.out.println(n1.toString());
        Nave n2= new Nave(100,100,'N',200);
        System.out.println(n1.toString());
        System.out.println("Son naves iguales n1 y n2?: "+n1.equals(n2));






















        // Ejemplo de polimorfismo, usamos solo Objeto
        System.out.println("--------------------------");
        Objeto o1= new Nave(100,100,'S',150);
        Objeto o2= new Asteroide(100,150,'E',1000);
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        o1.irA(200,200,'O');
        o2.irA(200,200,'O');
        System.out.println(o1.toString());
        System.out.println(o2.toString());
    }
}
