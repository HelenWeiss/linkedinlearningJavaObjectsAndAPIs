package abstraction.shapes;

public class ShapeTester {

    public static void main(String[] args) {

        //Shape rectangle = new Shape(); // error, methods must be implemented (but Shape is abstract, instead new Rectangle
        Shape rectangle = new Rectangle(5, 7);
        System.out.println(rectangle.calculateArea());
    }
}
