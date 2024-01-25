package Final.CommandPattern1;

// This is known as the invoker
// It has a method press() that when execute
// causes the execute method to be called

public class DeviceButton {
    Command theCommand;

    public DeviceButton(Command newCommand){
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }
}
