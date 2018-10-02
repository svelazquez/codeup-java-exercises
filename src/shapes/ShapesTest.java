package shapes;

public class ShapesTest {
    public static void main(String[] args) {
       Measurable myShape = new Rectangle(10, 32.0);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(35.55);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}
