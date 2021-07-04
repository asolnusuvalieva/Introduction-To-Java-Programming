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

    int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index of reading a value!");
        }
        return data[index];
    }

    void set(int index, int value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index of replacing a value!");
        }
        data[index] = value;
    }

    void add(int value){ //Appending
        if(size + 1 > data.length){
            int[] temp = new int[size * SIZE_MULTIPLIER];
            System.arraycopy(data, 0, temp, 0, size);
            data = temp;
        }
        data[size] = value;
        size++;
    }
}
