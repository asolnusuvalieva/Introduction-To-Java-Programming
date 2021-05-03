public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        while (num < 20){
            num++;
            sum += num;
            if(sum >= 100){
                break;
            }
        }
    }
}
