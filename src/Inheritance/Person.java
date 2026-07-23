package Inheritance;

// superclass (parent)
public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("In Person default constructor");
    }

    public Person(String name) {
        System.out.println("In Person 2nd constructor. Name is set");
    }

    public String setName(String name) { return name; }
    public int setAge(String name) { return age; }
    public String setGender(String gender) { return gender; }

    public void getName() {this.name = name; }
    public void getAge() {this.age = age; }
    public void getGender() {this.gender = gender; }

}
