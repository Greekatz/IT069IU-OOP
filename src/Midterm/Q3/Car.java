package Midterm.Q3;

public class Car extends Vehicle {
    public Car(String brand, int size, String color, int speed) {
        super(brand, 4, color, speed);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }


    @Override
    public void showType() {
        System.out.println("Car");
    }
}
