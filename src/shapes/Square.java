package shapes;

//Square should define a constructor that accepts one argument

public class Square extends Rectangle {
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double length, double width, double side) {
        super(length, width);
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }


    public double getArea() {
        return Math.pow(side, 2);
    }


    public void setLength(double side) {
        setWidth(side);
    }


    public void setWidth(double side) {
        width = side;
        length = side;
        this.side = side;
    }
}
