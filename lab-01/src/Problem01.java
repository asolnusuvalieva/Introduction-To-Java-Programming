public class Problem01 {
    final static int WIDTH = 20;
    final static int HEIGHT = 20;

    final static char FIELD_TURTLE_CELL = 'T';
    final static char FIELD_EMPTY_CELL = '.';
    final static char FIELD_MARKED_CELL = '*';

    static char[][] fieldContent;

    static void fieldInit(){
        fieldContent = new char[WIDTH][HEIGHT];
        for(int i = 0; i < HEIGHT; i++){
            for (int j = 0; j < WIDTH; j++){
                fieldContent[i][j] = FIELD_EMPTY_CELL;
            }
        }
    }

    static boolean fieldAreCoordsInside(int x, int y){
        return x >= 0 && x < WIDTH && y >= 0 && y < HEIGHT;
    }

    static void fieldPutMark(int x, int y){
        if (fieldAreCoordsInside(x, y)){
            fieldContent[y][x] = FIELD_MARKED_CELL;
        }
    }

    static void fieldDisplay(){
        for(int i = 0; i < HEIGHT; i++){
            for (int j = 0; j < WIDTH; j++){
                if(turtleY == i && turtleX == j){
                    System.out.print(FIELD_TURTLE_CELL);
                }else{
                    System.out.print(fieldContent[i][j]);
                }
            }
            System.out.println();
        }
    }

    static int turtleX = 0, turtleY = 0; //by default, the location is (0, 0)
    static boolean turtleIsPenDown = false; //be default, the pen is UP
    static int turtleDX = 1, turtleDY = 0; //be default, the turtle looks to the right

    static void turtlePutPenUp(){
        turtleIsPenDown = false;
    }
    static void turtlePutPenDown(){
        turtleIsPenDown = true;
    }

    static void turtleTurnRight(){
        int temp = turtleDX;
        turtleDX = turtleDY;
        turtleDY = temp;

        turtleDX = -turtleDX;
    }

}

