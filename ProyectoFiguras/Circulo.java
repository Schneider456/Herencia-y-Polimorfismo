/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Circulo extends Figura {
    private float radio;
    float pi = 3.1416F;
    public Circulo (float r) {
        radio = r;
    }
    
    public void calculaArea() {
        area = pi * radio * radio;
    }
}