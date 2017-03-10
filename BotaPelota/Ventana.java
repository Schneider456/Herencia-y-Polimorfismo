import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Ventana extends JFrame{
   
   private Lienzo dibujo;
   
   public Ventana (int ancho, int alto) {
       this.setSize(ancho, alto);
       dibujo = new Lienzo();
       //dibujo.addKeyListener(dibujo);
       this.add(dibujo);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   
   class EscuchadorTeclado implements KeyListener {
    @Override
    public void keyPressed (KeyEvent e) {
        System.out.println("KeyPressed: " + e.getKeyChar());
    }
    
    @Override
    public void keyReleased (KeyEvent e) {
        System.out.println("KeyReleasd: " + e.getKeyChar());
    }
    
    @Override
    public void keyTyped (KeyEvent e) {
        System.out.println("KeyTyped: " + e.getKeyChar());
    }
    
   }
   
}
