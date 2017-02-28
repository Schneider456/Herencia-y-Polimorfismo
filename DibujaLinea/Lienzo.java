import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Lienzo extends JPanel {
    /*private ArrayList<Figura> figuras;
    
    public Lienzo () {
        figuras = new ArrayList<Figura>();
    }
    */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("Hola Mundo :3", 100, 200);
        g2.drawRect(50, 30, 80, 100);
        g2.drawLine(60, 70, 100, 100);
    }
}