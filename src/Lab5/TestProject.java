package Lab5;
import java.util.Calendar;
import java.util.Date;

public class TestProject {
    public static void main(String[] args) {
        Date startDate = new Date(2023, Calendar.NOVEMBER, 18);
        Date endDate = new Date(2023, Calendar.DECEMBER, 19);
        Project project = new Project("Huydietthegioi", startDate, endDate);

        // Hiring Employee
        Employee employee1 = new Employee("1", "John", 20, 5, 2);
        Employee employee2 = new Employee("2", "Kory", 25, 3, 1);
        Employee employee3 = new Employee("3", "Batman", 18, 4, 0);
        Employee employee4 = new Employee("4", "Harley Quinn", 22, 6, 2);
        Employee employee5 = new Employee("5", "Luffy", 30, 2, 1);

        // Add Employees
        project.addEmployee(employee1);
        project.addEmployee(employee2);
        project.addEmployee(employee3);
        project.addEmployee(employee4);
        project.addEmployee(employee5);

        ProjectPrinter projectPrinter = new ProjectPrinter(project);
        Thread t1 = new Thread(projectPrinter);
        t1.start();

    }
}
