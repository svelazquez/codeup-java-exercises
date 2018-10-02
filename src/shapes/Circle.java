package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius){
        return Math.PI * (Math.pow(radius, 2));
    }
    public double getCircumference(double radius){
        return 2 * Math.PI * radius;
    }
}
