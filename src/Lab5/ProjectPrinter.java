package Lab5;

public class ProjectPrinter implements Runnable {
    private Project project;

    public ProjectPrinter(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void run() {
        for (Employee employee: project.getListOfEmployee()) {
            try {
                Thread.sleep(1000);
                System.out.printf("%nProject ID: %s - Project Duration:: %s to %s%n",
                        getProject().getProjectId(),
                        getProject().getStartDate(),
                        getProject().getEndDate());

                System.out.printf("Name: %s - Salary Per Hour: %d%n",
                        employee.getEmployeeName(), employee.getSalaryPerHour());
            } catch (InterruptedException e) {
                System.out.print("");
            }

        }

    }
}
