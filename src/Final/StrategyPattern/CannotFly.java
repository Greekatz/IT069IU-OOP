package Final.StrategyPattern;

public class CannotFly implements Flyable {
    public void fly() {
        System.out.println("I don't fly");
    }
}
