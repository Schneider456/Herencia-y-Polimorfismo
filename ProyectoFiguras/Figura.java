import java.awt.Graphics;
import java.awt.Graphics2D;

abstract public class Figura {
    private int posx;
    private int posy;
    
    public Figura (int x, int y) {
        posx = x;
        posy = y;
    }
    
    protected int dimeX () {
        return posx;
    }
    
    protected int dimeY () {
        return posy;
    }
    
    abstract public void dibuja (Graphics g);
}
