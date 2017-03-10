import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.Rectangle;

public class Lienzo extends JPanel /*implements KeyListener*/ {    
    private Pelota pelota;
    
    public Lienzo () {
        pelota = new Pelota(100, 100, 10);
        EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        Timer tiempo = new Timer(100, escuchaTiempo);
        tiempo.start();
        //this.addKeyListener(this);
    }
   
    @Override
    public void paintComponent (Graphics g) {
        pelota.dibujate(g);
    }
    
    class EscuchadorTiempo implements ActionListener{
        Rectangle r = new Rectangle(800, 600);
        Graphics g;
        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("Hola Pelota");
            pelota.muevete(r.getBounds());
            repaint();
        }
    }
    
}
