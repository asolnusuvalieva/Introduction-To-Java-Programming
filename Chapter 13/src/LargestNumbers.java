import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(45); // Add an integer
        list.add(3445.53); // Add a double

        // Add a BigInteger
        list.add(new BigInteger("3432323234344343101"));
        // Add a BigDecimal
        list.add(new BigDecimal("2.0909090989091343433344343"));
    }
}
