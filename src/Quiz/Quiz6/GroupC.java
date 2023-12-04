package Quiz.Quiz6;


public class GroupC extends Student {
    public GroupC(String name, String id, int result) {
        super(name, id, result);
    }
    public boolean register(String courseName) {
        return courseName.equals("EE");

    }
}
