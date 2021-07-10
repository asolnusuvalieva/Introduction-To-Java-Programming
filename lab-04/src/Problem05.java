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
            for(int i = 0; i < COUNT*2 ; i++){
                list.remove(0);
            }
        }

        endTime = System.nanoTime();
        deltaTime = endTime - startTime;

        System.out.printf("ArrayList<Integer>: %.1f%n", deltaTime/1e+9f);

        startTime = System.nanoTime();

        {
            ArrayListInt list = new ArrayListInt();
            for(int i = 0; i < COUNT; i++){
                list.add((int)(Math.random() * 1000));
            }
            for(int i = 0; i < COUNT; i++){
                list.add(0, (int)(Math.random() * 1000));
            }
            for(int i = 0; i < COUNT*2; i++){
                list.remove(0);
            }
        }

        endTime = System.nanoTime();
        deltaTime = endTime - startTime;

        System.out.printf("ArrayListInt, no optimization applied: %.1f%n", deltaTime/1e+9f);


        startTime = System.nanoTime();

        {
            SmartArrayListInt list = new SmartArrayListInt();
            for(int i = 0; i < COUNT; i++){
                list.add((int)(Math.random() * 1000));
            }
            for(int i = 0; i < COUNT; i++){
                list.add(0, (int)(Math.random() * 1000));
            }
        }
    }
}
