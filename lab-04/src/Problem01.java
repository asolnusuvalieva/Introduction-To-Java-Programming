import java.util.ArrayList;

public class Problem01 {
    private static void reverse(ArrayList<Integer> numbers){
        for(int i = 0, j = numbers.size() - 1; i < j; i++, j--){
            int temp = numbers.get(i); //reading an information, automatic boxing
            numbers.set(i, numbers.get(j)); //writing/replacing
            numbers.set(j, temp);
        }
    }
}
