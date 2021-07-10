import java.util.ArrayList;

public class Problem05 {
    public static void main(String[] args) {
        final int COUNT = 10000;

        long startTime, endTime, deltaTime;
        startTime = System.nanoTime();

        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < COUNT; i++){
                list.add((int)(Math.random() * 1000));
            }
            for(int i = 0; i < COUNT; i++){
                list.add(0, (int)(Math.random() * 1000));
            }
        }
    }
}
