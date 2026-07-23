package Inheritance;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("In Person default constructor");
    }

    public String setName(String name) { return name; }
    public int setAge(String name) { return age; }
    public String setGender(String gender) { return gender; }

    public void getName() {this.name = name; }
    public void getAge() {this.age = age; }
    public void getGender() {this.gender = gender; }

}
