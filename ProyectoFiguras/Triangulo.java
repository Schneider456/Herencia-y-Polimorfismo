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
        Color azul = new Color(0, 0, 255);
        g.setColor(azul);
        g.drawLine(dimeX(), dimeY(), dimeX() + (int)base / 2, dimeY() + (int)altura);
        g.drawLine(dimeX(), dimeY(), dimeX() - (int)base / 2, dimeY() + (int)altura);
        g.drawLine(dimeX() + (int)base / 2, dimeY() + (int)altura, dimeX() - (int)base / 2, dimeY() + (int)altura);
    }
}
