package abstraction.shapes;

public class Rectangle extends Shape {  // Rectangle must be also abstract, if it extends abstract class Shape

    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // override for body of abstract method from abstract class Shape
    @Override
    double calculateArea() {
        return length * width;
    }

    // getters and setters
    public double getLength() {return length;}
    public double getWidth() {return width;}

    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }

    /*
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
     */
}
