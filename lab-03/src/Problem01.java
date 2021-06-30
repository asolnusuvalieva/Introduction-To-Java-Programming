import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator of Rational Numbers");

        printUserMessage();
    }

    public static void printUserMessage(){
        System.out.print("Enter the first rational (press Ctrl-Z to exit): ");
    }

    public static boolean contains(String operator){
        String[] operators = {"*", "/", "-" , "+" , ">", "<", ">=", "<=", "=", "!="};
        boolean contains = false;
        for(String correctOperator : operators){
            if(correctOperator.equals(operator)){
                contains = true;
                break;
            }
        }

        return contains;
    }
}
