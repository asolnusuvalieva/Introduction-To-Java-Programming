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

        System.out.println("The sum is " + sum); //105
        System.out.println("The num is " + num); //14
    }
}
