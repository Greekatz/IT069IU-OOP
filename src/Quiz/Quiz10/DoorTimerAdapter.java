package Quiz.Quiz10;

public class DoorTimerAdapter implements TimeClient {

    private TimedDoor door;

    public DoorTimerAdapter(TimedDoor door) {
        this.door = door;
    }

    public int timeOutPeriod() {
        return 20;
    }
    @Override
    public void Timeout() {
        if (door.getIsOpen())
            door.close();
        else
            door.open();
    }
}
