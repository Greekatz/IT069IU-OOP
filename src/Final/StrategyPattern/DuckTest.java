package Final.StrategyPattern;

public class DuckTest {
    public static void main(String[] args) {
        Dabbler dabbler = new Dabbler();
        Rubber rubber = new Rubber();
        rubber.display();
        dabbler.tryFlying();
        rubber.tryFlying();

    }
}
