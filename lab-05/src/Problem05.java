import javax.swing.*;
import java.awt.*;

class Field{
    private static final int DEFAULT_FIELD_WIDTH = 10;
    private static final int DEFAULT_FIELD_HEIGHT = 10;

    private final int width, height;

    Field(){
        this(DEFAULT_FIELD_WIDTH, DEFAULT_FIELD_HEIGHT); //by default
    }
    Field(int width, int height){
        this.width = width;
        this.height = height;
    }

    int getWidth(){
        return width;
    }
    int getHeight(){
        return height;
    }

    boolean areCoordsInside(int x, int y){
        return x >= 0 && x < width &&
                y >= 0 && y < height;
    }
}

class Robot{ //a circle
    private int x, y;
    private final Field field;

    Robot(Field field){
        this(field, 0, 0); //by default, (0, 0)
    }

    Robot(Field field, int x, int y){
        this.field = field;
        this.x = x;
        this.y = y;
    }

    int getX(){
        return x;
    }
    int getY(){
        return y;
    }

    void moveLeft(){
        int nextX = x - 1;
        int nextY = y;

        if(field.areCoordsInside(nextX, nextY)){
            x = nextX;
        }
    }
    void moveRight(){
        int nextX = x + 1;
        int nextY = y;

        if(field.areCoordsInside(nextX, nextY)){
            x = nextX;
        }
    }
    void moveUp(){
        int nextY = y - 1;
        int nextX = x;

        if(field.areCoordsInside(nextX, nextY)){
            y = nextY;
        }
    }
    void moveDown(){
        int nextY = y + 1;
        int nextX = x;

        if(field.areCoordsInside(nextX, nextY)){
            y = nextY;
        }
    }
}

class RobotCheckerboard extends JPanel {
    private final Field field;
    private final Robot robot;

    RobotCheckerboard(Field field, Robot robot){
        this.field = field;
        this.robot = robot;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //combining old/parent's logic
        /*
        g can do a lot of useful things
         */

        //Dynamic choice of the cell size
        int cellSize = (int)(Math.min(getWidth()/field.getWidth(), getHeight()/field.getHeight())*0.85f); //80% is for the cell, while 20% is to give space
        int screenFieldWidth = field.getWidth() * cellSize;
        int screenFieldHeight = field.getHeight() * cellSize;
        int centeringShiftX = (int)((getWidth() - screenFieldWidth)/2.0f);
        int centeringShiftY = (int)((getHeight() - screenFieldHeight)/2.0f);

        //Drawing Checkerboard
        for(int y = 0; y < field.getHeight(); y++){
            for(int x = 0; x < field.getWidth(); x++){
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

        //Drawing Robot
        int screenX = centeringShiftX + robot.getX() * cellSize;
        int screenY = centeringShiftY + robot.getY() * cellSize;
        g.setColor(Color.RED);
        g.fillOval(screenX, screenY, cellSize, cellSize);
    }
}
public class Problem05 {
}
