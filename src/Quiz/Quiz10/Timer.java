package Quiz.Quiz10;

import java.util.List;

public class Timer{

    TimeClient[] clients = new TimeClient[5];
    private int numClients = 0;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 0) {
                for (TimeClient timeClient : clients) {
                    System.out.println(i);
                    timeClient.Timeout();
                }
            }
        }
    }

    public void register(TimeClient client) {
        clients[numClients] = client;
        numClients++;
    }

}
