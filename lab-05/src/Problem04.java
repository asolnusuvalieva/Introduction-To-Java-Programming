import javax.swing.*;
import java.awt.*;

class Checkerboard extends JPanel {
    private static final int FIELD_WIDTH = 10;
    private static final int FIELD_HEIGHT = 10;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //combining old/parent's logic

        //Dynamic choice of the cell size
        int cellSize = (int)(Math.min(getWidth()/FIELD_WIDTH, getHeight()/FIELD_HEIGHT)*0.85f); //80% is for the cell, while 20% is to give space
        int screenFieldWidth = FIELD_WIDTH * cellSize;
        int screenFieldHeight = FIELD_HEIGHT * cellSize;
        int centeringShiftX = (int)((getWidth() - screenFieldWidth)/2.0f);
        int centeringShiftY = (int)((getHeight() - screenFieldHeight)/2.0f);

        for(int y = 0; y < FIELD_HEIGHT; y++){
            for(int x = 0; x < FIELD_WIDTH; x++){
                int screenX = centeringShiftX + x * cellSize;
                int screenY = centeringShiftY + y * cellSize;

                if((y + x) % 2 == 0){
                    g.setColor(Color.BLACK);
                }else{
                    g.setColor(Color.WHITE);
                }
                g.fillRect(screenX, screenY, cellSize, cellSize);
            }
        }
    }
}
public class Problem04 extends JFrame{
}
