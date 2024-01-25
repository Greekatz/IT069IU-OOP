package Final.ObserverPattern.PvZ;

public interface Subject {
    void Attach(Observer observer);
    void Detach(Observer observer);
    void notifyObservers();
}
