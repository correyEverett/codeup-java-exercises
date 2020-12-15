package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getPerimeter() {
//        return (length + width) * 2;
//    }
//
//    public int getArea (){
//        return length * width;
//    }


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
