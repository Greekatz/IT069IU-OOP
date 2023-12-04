package Lab5;

public class Employee implements Comparable<Employee> {
    private String employeeId;
    private String employeeName;
    protected int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    // Default constructor
    public Employee() {

    }
    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        setNoOfLeavingDay(noOfLeavingDay);
        setNoOfTravelDay(noOfTravelDay);
    }


    public Employee(String employeeId, String employeeName, int salaryPerHour) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public void setNoOfLeavingDay(int noOfLeavingDay) {
        if (noOfLeavingDay <= 7) {
            this.noOfLeavingDay = noOfLeavingDay;
        } else {
            throw new IllegalArgumentException("Less than or equal 7 !");
        }
    }

    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public void setNoOfTravelDay(int noOfTravelDay) {
        if (noOfTravelDay <= 7) {
            this.noOfTravelDay = noOfTravelDay;
        } else {
            throw new IllegalArgumentException("Less than or equal 7 !");
        }
    }


    public int calculateWeeklySalary(){
        return getSalaryPerHour() * 8 * (5- getNoOfLeavingDay()
        + getNoOfTravelDay() / 2) ;

    }

    @Override
    public int compareTo(Employee target){
        final int BEFORE = -1;
        final int AFTER = 1;

        if (this.getNoOfTravelDay() > target.getNoOfTravelDay()) {
            return AFTER;
        }

        if (this.getNoOfTravelDay() == target.getNoOfTravelDay()) {
            if(this.getNoOfLeavingDay() < target.getNoOfLeavingDay()) {
                return BEFORE;
            }
        }
        return 0;
    }

    public String toString(){
        return String.format("Name: %s - Salary Per Hour: %d - WeeklySalary: %d",
                getEmployeeName(), getSalaryPerHour(), calculateWeeklySalary());
    }

}
