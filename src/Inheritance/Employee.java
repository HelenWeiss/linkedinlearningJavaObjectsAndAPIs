package Inheritance;

// subclass (child)
public class Employee extends Person {

    private String employeeId;
    private String title;

    public Employee() {
        super("John Doe"); //an explicit call to the superclass's constructor  must be 1st statement in the subclass
        System.out.println("In Employee default constructor");
    }

    public String setEmployeeId(String employeeId) { return employeeId; }
    public String setTitle(String title) { return title; }

    public void getemployeeId() {this.employeeId = employeeId; }
    public void getTitle() {this.title = title; }


}
