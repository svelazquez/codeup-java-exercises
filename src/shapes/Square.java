package shapes;

public class Square extends Rectangle {
    protected int side;

    public Square(int side){
       super(side, side);
    }


    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public int getPerimeter() {
        return length * 2 + width * 2;
    }
}
