public class CircleWithPrivateDataFields{
    /** The radius of the circle */
    private double radius = 1;

    /** The number of objects created */
    private static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    public CircleWithPrivateDataFields(){
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    public CircleWithPrivateDataFields(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius(){
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /** Return numberOfObjects */
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    /**  Return the area of this circle */
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
/*
Since these methods are the only ways to read and modify the radius,
you have total control over how the radius property is accessed.
If you have to change the implementation of these methods,
you don’t need to change the client programs. This makes the class easy to maintain.
 */