package Quiz.Quiz10;

public class TimedDoor extends Door {
    private DoorTimerAdapter adapter;

    public TimedDoor() {
        adapter = new DoorTimerAdapter(this);
    }

    
    public void DoorTimeOut(int timeOutId) {

    }
}
