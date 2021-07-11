
import javax.swing.*;
import java.awt.*;

public class Problem01 extends JFrame {
    Problem01(){
        /* WINDOW */
        setSize(400, 400);
        setLocationRelativeTo(null); //set the window to the center of the screen
        setTitle("Lab-05: Problem01");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //What to do by default when we close the window? //it'll stop the program
        setLayout(new BorderLayout()); //Choose a layout engine

        /* Red Panel */
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        /* Adding the panel to the window */
        add(mainPanel, "Center");
    }

}
