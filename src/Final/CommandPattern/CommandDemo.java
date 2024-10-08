package Final.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static List produceRequest() {
        List<Command> queue = new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    public static void workOffRequests(List queue) {
        for (Object command : queue) {
            ((Command) command).execute();
        }
    }

    public static void main(String[] args) {
        List queue = produceRequest();
        workOffRequests(queue);
    }
}
