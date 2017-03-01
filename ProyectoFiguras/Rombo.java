import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Rombo extends Figura {
    private int diagonalMayor;
    private int diagonalMenor;
    
    public Rombo (int x, int y, int diaMa, int diaMe) {
        super(x, y);
        diagonalMayor = diaMa;
        diagonalMenor = diaMe;
    }
    
    @Override
    public void dibuja (Graphics g) {
        
    }
}
