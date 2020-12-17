package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    //Properties
    protected double length;
    protected double width;
    //Constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    //Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
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
