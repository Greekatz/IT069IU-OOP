
public class ManageMajor {
    public static void main(String[] args) {
        // Student student1 = new Student("Hung");
        // Student student2 = new Student("Hungf");

        // student1.setMajor("CS");
        // student2.setMajor("NE");

        // System.out.println("Student:" + student1.getName() + ",ID: " + student1.getID() + student1.getMajor());
        Student student = Student.getNewStudent("John Doe");
        System.out.println("Student name:" + student.getName());

    }
    
}