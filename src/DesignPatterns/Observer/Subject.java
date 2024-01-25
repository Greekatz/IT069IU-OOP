package DesignPatterns.Observer;

public class Subject {
    private Observer[] observers = new Observer[10];

    private int n = 0 ;
    public Subject() {

    }

    public void attach(Observer o) {
        observers[n++] = o;
    }

    public void detach(Observer o) {
        for (int i = 0; i < n; i++) {
            if(observers[i].equals(o)) {
                for (int j = i; j < n-1; j++) {
                    observers[i] = observers[i+1];
                }
            }
        }
    }

    public void notiAll() {
        for (int i = 0; i < n; i++) {
            observers[i].update();
        }
    }
}
