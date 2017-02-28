import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circulo extends Figura {
    private float radio;
    
    public Circulo (int x, int y, float r) {
        super(x, y);
        radio = r;
    }
    
    @Override
    public void dibuja (Graphics g) {
        
    }
}