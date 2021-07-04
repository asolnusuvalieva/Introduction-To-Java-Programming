public class SmartArrayListInt {
    private static final int DEFAULT_CAPACITY = 8;
    private static final int SIZE_MULTIPLIER = 2;

    private int[] data;
    private int size; //actual number of existing elements

    SmartArrayListInt(){
        data = new int[DEFAULT_CAPACITY];
        size = 0; //at the start, it contains nothing
    }

    int size()  {
        return size;
    }

}
