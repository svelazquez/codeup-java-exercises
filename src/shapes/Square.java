package shapes;

public class Square extends Quadrilateral{

    public Square(double length) {
        super(length, length);
    }


    @Override
    public void setLength (double length) {
            this.length = length;
            this.width = length;
    }

    @Override
    public void setWidth (double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getPerimeter () {
        return 4*this.length;
    }

    @Override
    public double getArea () {
        return this.length*this.length;
    }

}
