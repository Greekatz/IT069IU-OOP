package Midterm.Q6;

public class Manager extends Employee{
    public Manager(int salaryCoefficients, String name, String id, String birthDate, String address, String employedDate, double salary) {
        super(salaryCoefficients, name, id, birthDate, address, employedDate, salary);
    }

    @Override
    public double MonthlySalary() {
        return getSalary() * getSalaryCoefficients();
    }
}
