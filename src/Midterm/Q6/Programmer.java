package Midterm.Q6;

public class Programmer extends Employee {
    private int overTimeSalary;

    public Programmer(int salaryCoefficients, String name, String id, String birthDate, String address, String employedDate, double salary, int overTimeSalary) {
        super(salaryCoefficients, name, id, birthDate, address, employedDate, salary);
        this.overTimeSalary = overTimeSalary;
    }

    public double MonthlySalary() {
        return getSalary() * getSalaryCoefficients() + overTimeSalary;
    }
}
