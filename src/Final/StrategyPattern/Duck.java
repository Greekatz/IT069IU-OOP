package Final.StrategyPattern;

public abstract class Duck {
    private String name;
    private Flyable flyStatus;
    public Duck(String n, Flyable f) {
        this.name = n;
        this.flyStatus = f;
    }

    public void tryFlying() {
        flyStatus.fly();
    }

    public void display() {
        this.tryFlying();
    }
}
