import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Triangulo extends Figura {
    private float base;
    private float altura;
    
    public Triangulo (int x, int y, float a, float b) {
        super(x, y);
        base = b;
        altura = a;
    }
    
    @Override
    public void dibuja (Graphics g) {
        
    }
}
