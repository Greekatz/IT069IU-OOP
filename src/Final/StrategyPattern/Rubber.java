package Final.StrategyPattern;

public class Rubber extends Duck {
    public Rubber() {
        super("Rubber", new CannotFly());
    }
}
