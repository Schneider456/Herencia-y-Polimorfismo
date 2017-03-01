import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Circulo extends Figura {
    private float radio;
    
    public Circulo (int x, int y, float r) {
        super(x, y);
        radio = r;
    }
    
    @Override
    public void dibuja (Graphics g) {
        g.drawOval(super.dimeX(), super.dimeY(), (int)radio, (int)radio);
    }
}