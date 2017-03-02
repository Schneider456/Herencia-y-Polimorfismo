import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Lienzo extends JPanel {
    private ArrayList<Figura> figuras;
    
    public Lienzo () {
        figuras = new ArrayList<Figura>();
        figuras.add(new Circulo(50, 50, 50));
        figuras.add(new Cuadrado(100, 100, 50));
        figuras.add(new Cuadrado(200, 200, 50));
        figuras.add(new Circulo(250, 250, 50));
        figuras.add(new Triangulo(350, 200, 50, 50));
    }
    
    @Override
    public void paintComponent(Graphics g) {
        for (Figura f : figuras) {
            f.dibuja(g);
        }
    }
}