package Quiz.Quiz9;

public class Lamp implements ButtonServer{

    @Override
    public void turnOff() {
        System.out.println("Lamp turns off");
    }

    @Override
    public void turnOn() {
        System.out.println("Lamp turns on");
    }

    public static void main(String[] args) {
        Button lamp = new Button();
        lamp.turnOff();
    }
}
