package Final.CommandPattern1;

import Final.CommandPattern.Command;

// Invoker class

public class TurnTVOff implements Command {
    ElectronicDevice electronicDevice;

    public TurnTVOff(ElectronicDevice newDeivce) {
        electronicDevice = newDeivce;
    }

    public void execute() {
        electronicDevice.off();
    }
}
