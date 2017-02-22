
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
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
        
        Figura []arregloFiguras = new Figura[3]; 
        
        arregloFiguras[0] = t1;
        arregloFiguras[1] = c1;
        arregloFiguras[2] = cu1;
        
        for (int i = 0; i < arregloFiguras.length; i++) {
            arregloFiguras[i].calculaArea(); 
        }
        
        for (int j = 0; j < arregloFiguras.length; j++) {
            arregloFiguras[j].accedeArea(); 
        }
        
        for (Figura fig : arregloFiguras) {
            fig.calculaArea();
        }
        
        for (Figura fig1 : arregloFiguras) {
            fig1.accedeArea();
        }
        
        ArrayList<Figura> figu = new ArrayList<Figura>();
        for (int k = 0; k < figu.size(); k++) {
            Figura c = figu.get(k);
            c.calculaArea();
        }
        
        for (int l = 0; l < figu.size(); l++) {
            Figura c = figu.get(l);
            c.accedeArea();
        }
        
    }
}
