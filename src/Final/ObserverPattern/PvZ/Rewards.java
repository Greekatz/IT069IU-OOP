package Final.ObserverPattern.PvZ;

// Concrete Observer class
public class Rewards implements  Observer {
    private Subject subject;

    public Rewards(Subject subject) {
        this.subject = subject;
        this.subject.Attach(this);
    }

    @Override
    public void update(int count) {
        if (subject instanceof  Plant) {
            ((Plant) subject).freeze_1s();
        }
        if (subject instanceof  Zombie) {
            ((Zombie) subject).freeze_2s();
        }
    }
}
