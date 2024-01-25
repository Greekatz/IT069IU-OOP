package Lab3.Q3;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Hung", "Damsen");
        Student student1 = new Student("Hùng", "Damnuoc"
                , "CS", 2, 200);
//        Staff staff1 = new Staff("TMC", "IU", "IU", 100);

        System.out.println(person1.toString());
        System.out.println(student1.toString());
//        System.out.println(staff1.toString());
    }
}
