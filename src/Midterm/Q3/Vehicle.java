package Midterm.Q3;

abstract class Vehicle {
    protected String brand;
    protected int size;
    protected String color;
    protected int speed;

    public Vehicle() {
    }

    public Vehicle(String brand, int size, String color, int speed) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed == 1 || speed == 2 || speed == 4) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Invalid");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void showType();
}
