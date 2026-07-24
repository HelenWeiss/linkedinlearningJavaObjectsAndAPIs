package Polymorphism.employee;

public class Answer {

    public static void main(String [] args) {

        /*************************************************************
         This is how your code will be called.
         Your answer should be a report with the correct count
         for each type of employee.
         You can edit this code to try different testing cases.
         *************************************************************/
        Employee[] employees = {
                new Manager(),
                new Engineer(),
                new Manager(),
                new Intern(),
                new Intern(),
                new Manager(),
                new Engineer(),
                new Engineer(),
                new Engineer(),
                new Engineer()
        };
        EmployeeReport report = Answer.generateReport(employees);

        // check in console 1
        //System.out.println("Managers: " + report.getNumberOfManagers());
        //ystem.out.println("Engineers: " + report.getNumberOfEngineers());
        //System.out.println("Interns: " + report.getNumberOfInterns());

        // check in console 2 (professional) with @Override in EmployeeReport
        System.out.println(report);

    }


    static EmployeeReport generateReport(Employee[] employees) {

        int managerCount = 0;
        int engineerCount = 0;
        int internCount = 0;

        for(int i=0; i<employees.length; i++){

                //TODO: Determine the employee's role and increase the count appropriately

            if (employees[i] instanceof Manager) {
                managerCount++;
            } else if (employees[i] instanceof Engineer) {
                engineerCount++;
            } else if (employees[i] instanceof Intern) {
                internCount++;
            }
        }

        // Вместо цикла с индексом лучше использовать for-each:
        /*
        for (Employee employee : employees) {

            if (employee instanceof Manager) {
                managerCount++;
            } else if (employee instanceof Engineer) {
                engineerCount++;
            } else if (employee instanceof Intern) {
                internCount++;
            }
        }

         */

        // 💡 Для собеседований QA Automation полезно знать,
        // что начиная с Java 16 можно использовать более современный синтаксис pattern matching для instanceof:
        // if (employee instanceof Manager manager) {
        //    managerCount++;
        //}

        return new EmployeeReport(managerCount, engineerCount, internCount);
    }

}
