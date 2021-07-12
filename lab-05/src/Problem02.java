import javax.swing.*;
import java.awt.*;

public class Problem02 extends JFrame {
    JPanel mainPanel;
    Problem02(){
        /* WINDOW */
        setSize(400, 400);
        setLocationRelativeTo(null); //set the window to the center of the screen
        setTitle("Lab-05: Problem02");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //What to do by default when we close the window? //it'll stop the program
        setLayout(new BorderLayout()); //Choose a layout engine

        /* Red Panel */
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        add(mainPanel, "Center");

    }
}
