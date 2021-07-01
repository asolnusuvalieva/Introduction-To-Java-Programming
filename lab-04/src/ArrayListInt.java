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
}
