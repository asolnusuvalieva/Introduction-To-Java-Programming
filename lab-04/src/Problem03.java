import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayListInt numbers = new ArrayListInt();
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            numbers.add(number); //after each iteration, the array will grow
        }

        System.out.println("Before reversing:");
        System.out.println(numbers); //toString()

        System.out.println("After reversing:");
        reverse(numbers);
        System.out.println(numbers); //toString()

        addZerosBeforeEvenValues(numbers);
        System.out.println("After insertion:");
        System.out.println(numbers); //toString()

        removeOddValues(numbers);
        System.out.println("After deletions:");
        System.out.println(numbers); //toString()
    }

    private static void reverse(ArrayListInt numbers){
        for(int i = 0, j = numbers.size() - 1; i < j; i++, j--){
            int temp = numbers.get(i); //reading an information, automatic boxing
            numbers.set(i, numbers.get(j)); //writing/replacing
            numbers.set(j, temp);
        }
    }

    private static void addZerosBeforeEvenValues(ArrayListInt numbers){
        //inserts value 0 before each even number
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                numbers.add(i, 0);//inserting a new value
                i++; //to skip the element we just analyzed
            }
        }
    }

    private static void removeOddValues(ArrayListInt numbers){
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 != 0){
                numbers.remove(i);
                i--; //not to skip the next value
            }
        }
    }
}
