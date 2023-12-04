package Midterm.Q5;

import java.util.ArrayList;

public class Course {
    private final String id;
    private final String name;
    private int lectureCredits;
    private int labCredits;
    private static ArrayList<String> listOfIds = new ArrayList<>();
    private static ArrayList<String> listCourse = new ArrayList<>();
    private boolean requiresComputer;
    private boolean requiresEquipment;

    private Course(String id, String name, int lectureCredits, int labCredits) {
        this.id = id;
        this.name = name.toUpperCase();
        this.lectureCredits = lectureCredits;
        this.labCredits = labCredits;
        listOfIds.add(id);
        listCourse.add(name);

    }

    public static Course createCourse(String id, String name, int lectureCredits, int labCredits) {
        for (String courseId : listOfIds) {
            if (id.equals(courseId)) {
                throw new IllegalArgumentException("Invalid: Course ID must be unique");
            }
        }

        if (lectureCredits <= 0 || labCredits < 0) {
            throw new IllegalArgumentException("Invalid Credit");
        }

        return new Course(id, name, lectureCredits, labCredits);
    }

    public static Course createCourse(String id, String name, int lectureCredits, int labCredits, boolean requiresComputer, boolean requiresEquipment) {
        for (String courseId : listOfIds) {
            if (id.equals(courseId)) {
                throw new IllegalArgumentException("Invalid: Course ID must be unique");
            }
        }

        if (lectureCredits <= 0 || labCredits < 0) {
            throw new IllegalArgumentException("Invalid Credit");
        }

        Course course = new Course(id, name, lectureCredits, labCredits);
        course.requiresComputer = requiresComputer;
        course.requiresEquipment = requiresEquipment;
        return course;
    }

    public static String getListCourse() {
        return "Number of Course Created: " + listCourse.size();
    }

    public static ArrayList<String>  getCourse() {
        return listCourse;
    }

    @Override
    public String toString() {
        String courseInfo = "Course Info:\nCourse Name: " + name + "\nCourse ID: " + id + "\nLecture Credits: "
                + lectureCredits + "\nLab Credits: " + labCredits;

        if (labCredits > 0) {
            courseInfo += "\nHAVE LAB SESSSIONS" + "\nRequires Computer: " + (requiresComputer ? "Yes" : "No")
                    + "\nRequires Equipment: " + (requiresEquipment ? "Yes" : "No");
        }

        return courseInfo;
    }
}