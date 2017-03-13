import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Pelota {
    private int posx;
    private int posy;
    private int radio;
    private int incx;
    private int incy;
    
    public Pelota(int x, int y, int r) {
        posx = x;
        posy = y;
        radio = r;
        int aleatorio = (int)(Math.random() * 2);
        if (aleatorio == 0) {
            aleatorio = -1;
        }
        incx = aleatorio * 10;
        incy = aleatorio * 10;
    }
    
    public void dibujate(Graphics g) {
        Color color = new Color(0, 255, 0);
        g.setColor(color);
        g.fillOval(posx, posy, radio*2, radio*2);
        g.drawOval(posx, posy, radio*2, radio*2);
    }
    
    public void muevete(Rectangle r) {
        posx += incx;
        posy += incy;
        if (posx > r.getWidth()-radio*2 || posx < radio*2) {
            incx = -incx;
        }
        if (posy > r.getHeight()-radio*2 || posy < radio*2) {
            incy = -incy;
        }
    }
}