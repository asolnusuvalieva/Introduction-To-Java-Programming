/* Modifying the previous example: combining two classes into one*/
public class SimpleCircle {
    //Main Method
    public static void main(String[] args) {
        // Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "
                + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());

        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());
    }

    double radius;
    /** Construct a circle object */
    SimpleCircle() {
        radius = 1;
    }

    /** Construct a circle object */
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
    /** Return the perimeter of this circle */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    /** Set new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
/*
Since the combined class has a main method, it can be executed by the Java interpreter.
The main method is the same as that in Listing 9.1.
This demonstrates that you can test a class by simply adding a main method in the same class.
 */