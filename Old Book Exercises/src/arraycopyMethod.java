public class arraycopyMethod {
    public static void main(String[] args) {
        int [] sourceArray = {1, 2, 3, 4, 5};
        int [] targetArray = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        System.out.println("The contents of the source Array: ");
        for(int i = 0; i < sourceArray.length; i++){
            System.out.print(sourceArray[i] + " ");
        }
    }
}
