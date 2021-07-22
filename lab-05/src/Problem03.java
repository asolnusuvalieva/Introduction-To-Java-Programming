import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;

public class Problem03 {
    abstract class Reporter implements MouseMotionListener, KeyListener {
        protected final JFrame window; //window is repeated in two different listeners

    }
}
