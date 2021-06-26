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
}
