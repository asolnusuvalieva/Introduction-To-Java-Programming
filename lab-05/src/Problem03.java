import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

abstract class Reporter implements MouseMotionListener, KeyListener {
    protected final JFrame window; //window is repeated in two different listeners
    Reporter(JFrame window){
        this.window = window;
    }

    //Methods from MouseMotionListener
    public void mouseMoved(MouseEvent e) {}
    public void mouseDragged(MouseEvent e){}

    //Methods from KeyListener
    public void keyPressed(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
}
class MouseReporter extends Reporter {
    MouseReporter(JFrame window){
        super(window);
    }

    public void mouseMoved(MouseEvent e) {
        window.setTitle(e.getX() + ", " + e.getY());
    }
}

class KeyReporter extends Reporter {
    KeyReporter(JFrame window){
        super(window);
    }
    public void keyPressed(KeyEvent e) {
        window.setTitle(String.valueOf(e.getKeyChar()));
    }
}
public class Problem03 {

}
