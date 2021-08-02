import javax.swing.*;

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

}
public class Problem05 {
}
