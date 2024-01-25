package Final.CommandPattern1;

import java.util.ArrayList;
import java.util.List;
public class PlayRemote {
    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice();
        TurnTVOn onCommand = new TurnTVOn(newDevice);

        // Calling the execute() causes on() to execute in Television
        DeviceButton onPressed = new DeviceButton((Command) onCommand);
        onPressed.press();

    }
}
