package Midterm.Q6;

abstract class Employee {
    private int salaryCoefficients;
    private String name;
    private String id;
    private String birthDate;
    private String address;
    private String employedDate;
    private double salary;

    public Employee(int salaryCoefficients, String name, String id, String birthDate, String address, String employedDate, double salary) {
        this.salaryCoefficients = salaryCoefficients;
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
        this.address = address;
        this.employedDate = employedDate;
        this.salary = salary;
    }

    public int getSalaryCoefficients() {
        return salaryCoefficients;
    }

    public void setSalaryCoefficients(int salaryCoefficients) {
        this.salaryCoefficients = salaryCoefficients;
    }

    public double getSalary() {
        return salary;
    }

    abstract double MonthlySalary();
}
