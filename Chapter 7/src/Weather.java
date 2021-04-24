import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
        Scanner scanner = new Scanner(System.in);

        //initialization
        for(int k = 0; k < NUMBER_OF_DAYS*NUMBER_OF_HOURS; k++){
            int day = scanner.nextInt();
            int hour = scanner.nextInt();
            double temperature = scanner.nextDouble();
            double humidity = scanner.nextDouble();

            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;
        }

    }
}
