public class Turtle {
    private int x = 0, y = 0;
    private int dx = 1, dy = 0;
    private boolean isPenDown = false;
    private Field field;

    int getX(){
        return x;
    }
    int getY(){
        return y;
    }

    public void setX(int newX){
        if (Field.areCoordsInside(newX, y)){
            x = newX;
        }
    }
    public void setY(int newY){
        if (Field.areCoordsInside(x, newY)){
            y = newY;
        }
    }

    public Turtle(Field newField){
        field = newField;
    }
    public void putPenUp(){
        isPenDown = false;
    }
    public void putPenDown(){
        isPenDown = true;
    }

    public void turnRight(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dx = -dx;
    }

    public void turnLeft(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dy = -dy;
    }
}
