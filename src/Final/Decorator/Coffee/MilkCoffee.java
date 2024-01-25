package Final.Decorator.Coffee;

import Final.Decorator.Coffee.Coffee;
import Final.Decorator.Coffee.CoffeeDecorator;

public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee tree) {
        super(tree);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + decorateWithMilk();
    }

    private int decorateWithMilk() {
        return 5000;
    }
}
