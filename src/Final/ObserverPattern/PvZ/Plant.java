package Final.ObserverPattern.PvZ;

import java.util.ArrayList;
import java.util.List;

public class Plant implements Subject {
    private int nKilledZombies = 0;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void Attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(nKilledZombies);
        }
    }

    public void hasKilledAZombie() {
        nKilledZombies++;
        if (nKilledZombies % 50 == 0) {
            // Reward: Freeze all zombies for 2 seconds
            notifyObservers();
        }
    }

    public void freeze_1s() {
        System.out.println("All plants  are frozen for 1 second");
    }



}
