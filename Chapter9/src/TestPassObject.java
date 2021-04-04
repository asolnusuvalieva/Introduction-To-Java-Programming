public class TestPassObject {
    public static void main(String[] args) {
        // Create a Circle object with radius 1
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

        // Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(myCircle, n);


        // See myCircle.radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius()); //6, myCircle is affected
        System.out.println("n is " + n); //5, n is not affected
    }

    public static void printAreas(CircleWithPrivateDataFields c, int times){
        System.out.println("Radius \t\tArea");

        while (times >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
