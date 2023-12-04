package Quiz.Quiz6;

public class GroupA extends Student {
    public GroupA(String name, String id, int result) {
        super(name, id, result);
    }

    public boolean register(String courseName) {
        return courseName.equals("AE");
    }
}

