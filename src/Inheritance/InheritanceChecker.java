package Inheritance;

public class InheritanceChecker {
    
    public static void main(String[] args) {

        // Inheritance: call of Person class and Employee class
/*
        //Person person = new Person();
        //person.

        // by calling Employee class will be called Person class:
        //In Person default constructor -> is in Person class (parent class), was in a console also
        //In Employee default constructor -> is in Employee class, which was called
        Employee employee = new Employee();
        //employee.
*/

        // Inheritance: call of Rectangle class and Square class

        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        rectangle.calculatePerimeter();
        rectangle.print();

        square.calculatePerimeter();
        square.print();
    }
}
