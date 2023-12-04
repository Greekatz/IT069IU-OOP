package Midterm.Q5;


public class TestCourse {
    public static void main(String[] args) {
        // Create a course without computer and equipment requirements
        Course course1 = Course.createCourse("CS101", "Introduction to Programming", 3, 0);
        System.out.println(course1);

        // Create a course with computer and equipment requirements
        Course course2 = Course.createCourse("CS102", "Database Management", 3, 2, true, true);
        System.out.println(course2);
        System.out.println(Course.getCourse());
    }
}