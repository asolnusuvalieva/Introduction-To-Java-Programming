public class Field {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;

    private static final char TURTLE_CELL = 'T';
    private static final char EMPTY_CELL = '.';
    private static final char MARKED_CELL = '*';

    private char[][] content;

    public Field(){
        content = new char[HEIGHT][WIDTH];
        for(int i = 0; i < HEIGHT; i++){
            for (int j = 0; j < WIDTH; j++){
                content[i][j] = EMPTY_CELL;
            }
        }
    }

    static boolean areCoordsInside(int x, int y){
        return x >= 0 && x < WIDTH && y >= 0 && y < HEIGHT;
    }

    public void putMark(int x, int y){
        if (areCoordsInside(x, y)){
            content[y][x] = MARKED_CELL;
        }
    }
}