package Final.Decorator.Coffee;

import Final.Decorator.Coffee.Coffee;
import Final.Decorator.Coffee.CoffeeDecorator;

public class IceCream extends CoffeeDecorator {

    public IceCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + decoratorWithIceCream();
    }

    private int decoratorWithIceCream() {
        return 7000;
    }
}
