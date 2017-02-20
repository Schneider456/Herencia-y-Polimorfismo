
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Principal {
    public static void main (String []args) {
        Triangulo t1 = new Triangulo(3, 4);
        t1.calculaArea();
        System.out.println("El area del triangulo es: " + t1.accedeArea());
        
        Circulo c1 = new Circulo(8);
        c1.calculaArea();
        System.out.println("El area del circulo es: " + c1.accedeArea());
        
        Cuadrado cu1 = new Cuadrado(5);
        cu1.calculaArea();
        System.out.println("El area del cuadrado es: " + cu1.accedeArea());
    }
}
