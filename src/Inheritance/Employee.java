package Inheritance;

public class Employee extends Person {

    private String employeeId;
    private String title;

    public Employee() {
        System.out.println("In Employee default constructor");
    }

    public String setEmployeeId(String employeeId) { return employeeId; }
    public String setTitle(String title) { return title; }

    public void getemployeeId() {this.employeeId = employeeId; }
    public void getTitle() {this.title = title; }


}
