package Final.StrategyPattern;

public class Dabbler extends Duck {
    public Dabbler() {
        super("Dabber", new CanFly());
    }
}
