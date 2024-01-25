package Final.ObserverPattern.PvZ;

import java.util.ArrayList;
import java.util.List;

public class Zombie implements Subject {
    private int nDestroyedPlants = 0;
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
        for(Observer observer : observers) {
            observer.update(nDestroyedPlants);
        }
    }

    public void hasKillAPlant() {
        nDestroyedPlants++;
        if(nDestroyedPlants % 20 == 0) {
            // Reward for zombie: Freeze all plants for 1 seconds
            notifyObservers();
        }
    }

    public void freeze_2s() {
        System.out.println("All zombies are frozen for 2 seconds");
    }


}
