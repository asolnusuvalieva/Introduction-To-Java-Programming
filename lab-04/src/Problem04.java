import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartArrayListInt numbers = new SmartArrayListInt();

    }
    private static void reverse(SmartArrayListInt numbers){
        for(int i = 0, j = numbers.size() - 1; i < j; i++, j--){
            int temp = numbers.get(i); //reading an information, automatic boxing
            numbers.set(i, numbers.get(j)); //writing/replacing
            numbers.set(j, temp);
        }
    }

    private static void addZerosBeforeEvenValues(SmartArrayListInt numbers){
        //inserts value 0 before each even number
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                numbers.add(i, 0);//inserting a new value
                i++; //to skip the element we just analyzed
            }
        }
    }

    private static void removeOddValues(SmartArrayListInt numbers){
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 != 0){
                numbers.remove(i);
                i--; //not to skip the next value
            }
        }
    }
}
