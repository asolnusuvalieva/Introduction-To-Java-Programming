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
}
public class Problem05 {
}
