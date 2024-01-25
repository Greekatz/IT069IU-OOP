package Final.Decorator.Coffee;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new IceCream(new MilkCoffee(new DefaultCoffeeImpl()));
        System.out.println(coffee.getPrice());

        Coffee coffee1 = new MilkCoffee(new DefaultCoffeeImpl());
        System.out.println(coffee1.getPrice());
    }
}
