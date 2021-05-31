import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do{
            try{
                System.out.print("Enter an integer: ");
                int number = input.nextInt();
            }catch(InputMismatchException e){

            }
        }while(continueInput);
    }
}
