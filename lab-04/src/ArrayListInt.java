public class ArrayListInt {
    private int[] data;

    ArrayListInt(){
        data = new int[0];
    }

    int size(){
        return data.length;
    }

    int get(int index){
        return data[index]; //Java itself will raise Errors in case of incorrect input
    }

    void set(int index, int value){
        data[index] = value; //Java itself will raise Errors in case of incorrect input
    }

    void add(int value){ //Appending
        int[] temp = new int[data.length + 1];

        //Copying old values to the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        temp[temp.length - 1] = value;
        data = temp;
    }

    void add(int index, int value){ //Inserting
        if(index < 0 || index >= data.length){
            throw new IndexOutOfBoundsException("Invalid index of insertion!");
        }

        int[] temp = new int[data.length + 1];

        for(int i = 0; i < index; i++){
            temp[i] = data[i];
        }
        temp[index] = value;
        for(int i = index; i < data.length; i++){
            temp[i + 1] = data[i];
        }
        data = temp;
    }

    void remove(int index){
        if(index < 0 || index >= data.length){
            throw new IndexOutOfBoundsException("Invalid index of removal!");
        }
        int[] temp = new int[data.length - 1];

        for(int i = 0; i < index; i++){
            temp[i] = data[i];
        }
        for(int i = index + 1; i < data.length; i++){
            temp[i - 1] = data[i];
        }
        data = temp;
    }
}
