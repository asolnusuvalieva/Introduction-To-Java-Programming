public class TestCircleWithCustomException {
    public static void main(String[] args) {

    }
}

class CircleWithCustomException{
    private double radius;
    private static int numberOfObjects = 0;

    public void setRadius(double newRadius) throws InvalidRadiusException {
        if(newRadius >= 0){
            radius = newRadius;
        }else{
            throw new InvalidRadiusException(newRadius);
        }
    }
}
