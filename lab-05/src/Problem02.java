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

        JButton redButton = new JButton("RED"); //a button with a text/name
        redButton.addActionListener(e -> mainPanel.setBackground(Color.RED));

        JButton greenButton = new JButton("GREEN"); //a button with a text/name
        greenButton.addActionListener(e -> mainPanel.setBackground(Color.GREEN));

        JButton blueButton = new JButton("BLUE"); //a button with a text/name
        blueButton.addActionListener(e -> mainPanel.setBackground(Color.BLUE));

        JPanel toolbarPanel = new JPanel();
        toolbarPanel.setBackground(Color.DARK_GRAY);

        toolbarPanel.add(redButton);
        toolbarPanel.add(greenButton);
        toolbarPanel.add(blueButton);

        add(toolbarPanel, "South");
    }

    public static void main(String[] args) {
        new  Problem02().setVisible(true);
    }
}
