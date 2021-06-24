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
}

