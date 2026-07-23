package Inheritance;

// subclass (child)
public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * length; // sides and length are available cause they are protected in Rectangle parent class
    }
    
    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
