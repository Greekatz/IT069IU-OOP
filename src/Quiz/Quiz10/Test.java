package Quiz.Quiz10;

public class Test {
    public static void main(String[] args) {
        Timer timer = new Timer();

        Student student = new Student();

        timer.register(student);

        TimedDoor timedDoor = new TimedDoor();
        timer.register(new DoorTimerAdapter(timedDoor));
        timer.run();
    }
}
