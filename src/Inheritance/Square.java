package Inheritance;

// subclass (child)
public class Square extends Rectangle {

    // override a method from superclass
    @Override
    public double calculatePerimeter() {
        return sides * length; // sides and length are available cause they are protected in Rectangle parent class
    }

    // overload a method from superclass
    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
