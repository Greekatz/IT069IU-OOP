package Final.Decorator.Coffee;

import Final.Decorator.Coffee.Coffee;

public class DefaultCoffeeImpl implements Coffee {

    @Override
    public int getPrice() {
        return 5000;
    }
}
