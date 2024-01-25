package Final.Car;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(new Car(), new MotorBike());
        remote.clickOff();
    }
}
