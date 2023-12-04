package Quiz.Quiz6;

public class GroupB extends Student {
    public GroupB(String name, String id, int result) {
        super(name, id, result);
    }

    public boolean register(String courseName) {
        return courseName.equals("IE");

    }
}
