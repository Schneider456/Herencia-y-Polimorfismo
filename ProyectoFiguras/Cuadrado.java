import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Cuadrado extends Figura {
    
    private float lado;
    
    public Cuadrado(int x, int y, float l) {
        super(x, y);
        lado = l;
    }

    @Override
    public void dibuja (Graphics g) {
        Color verde = new Color(0, 255, 0);
        g.setColor(verde);
        g.drawRect(super.dimeX(), super.dimeY(), (int)lado, (int)lado);
    }
}
