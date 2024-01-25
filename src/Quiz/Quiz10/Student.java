package Quiz.Quiz10;

public class Student implements TimeClient {
    @Override
    public void Timeout() {
        System.out.println("Go to the gym");
    }

    @Override
    public int timeOutPeriod() {
        return 0;
    }
}
