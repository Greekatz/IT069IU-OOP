package Quiz.Quiz9;

public class Button implements ButtonServer  {
    private ButtonServer device;
    private boolean status = false;

    public void poll() {
        if (!status) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {
    }
}
