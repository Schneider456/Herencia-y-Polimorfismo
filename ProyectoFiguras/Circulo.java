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
        Color rojo = new Color(255, 0, 0);
        g.setColor(rojo);
        g.drawOval(dimeX(), dimeY(), (int)radio, (int)radio);
    }
}