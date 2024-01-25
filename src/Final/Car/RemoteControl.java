package Final.Car;

public class RemoteControl {
    private Devices[] devices = new Devices[2];
    public Devices lock;
    public RemoteControl(Car car, MotorBike motorBike) {
        this.devices[0] = car;
        this.devices[1] = motorBike;
    }

    public void clickOn() {
        this.devices[0].unlock();
        this.devices[1].unlock();
    }

    public void clickOff() {
        this.devices[0].lock();
        this.devices[1].lock();
    }



}
