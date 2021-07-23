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

public class Problem03 {

}
