package Quiz.Quiz9;

public class Motor implements ButtonServer{
    @Override
    public void turnOff() {
        System.out.println("Motor turns off");
    }

    @Override
    public void turnOn() {
        System.out.println("Motor turns on");
    }
}
