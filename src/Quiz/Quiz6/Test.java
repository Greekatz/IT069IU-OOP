package Quiz.Quiz6;

public class Test {
    public static void main(String[] args) {
        Student students[] = new Student[5];

        students[0] = new GroupA("A", "123", 90);
        System.out.println(students[0].register("OOP"));

    }
}
