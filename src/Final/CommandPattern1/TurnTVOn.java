package Final.CommandPattern1;

import Final.CommandPattern.Command;



public class TurnTVOn implements Command {
    ElectronicDevice electronicDevice;

    public TurnTVOn(ElectronicDevice newDeivce) {
        electronicDevice = newDeivce;
    }

    public void execute() {
        electronicDevice.on();
    }
}
