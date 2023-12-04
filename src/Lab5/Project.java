package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Project {
    private String projectId;
    private Date startDate;
    private Date endDate;
    private final ArrayList<Employee> listOfEmployee;

    public Project(String projectId, Date startDate, Date endDate) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployee = new ArrayList<>();
    }

    public String getProjectId() {
        return projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void addEmployee(Employee employee) {
        getListOfEmployee().add(employee);
    }

    public int estimateBudget() {
        int totalBudget = 0;
        long totalTime = getEndDate().getTime() - getStartDate().getTime();
        totalTime = totalTime / (1000 * 60 * 60);
        for (Employee eachEmployee : getListOfEmployee()) {
            totalBudget += eachEmployee.getSalaryPerHour() * (int) totalTime;
        }
        return totalBudget;
    }

    public String toString() {
        Collections.sort(getListOfEmployee());
        return getListOfEmployee().toString();
    }
}
