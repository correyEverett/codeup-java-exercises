package shapes;

public class Square extends Quadrilateral {

//    public Square(int side) {
//        super(side, side);
//    }
//
//    public int getArea() {
//       return length * length;
//    }
//
//    public int getPerimeter() {
//        return length * 4;
//    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }
}
