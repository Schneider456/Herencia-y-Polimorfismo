import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota {
    private int posx;
    private int posy;
    private int radio;
    
    public Pelota (int x, int y, int r) {
        posx = x;
        posy = y;
        radio = r;
    }
    
    public void dibujate (Graphics g) {
        g.drawOval(posx, posy, radio * 2, radio * 2);
    }
    
    public void muevete (Rectangle r) {
        int incx = 10;
        int incy = 10;
        //System.out.println("Con timer");
       
        if (posx < (r.getWidth() - 10) && posy < (r.getHeight() - 10)) {
            posx+=incx;
            posy+=incy;
            System.out.println("En x " + posx);
            System.out.println("En y " + posy);
        }
        
         if (posx < r.getWidth() && posy < r.getHeight()) {
            posx-=incx;
            posy+=incy;
            System.out.println("En x " + posx);
            System.out.println("En y " + posy);
        }
    }
}
