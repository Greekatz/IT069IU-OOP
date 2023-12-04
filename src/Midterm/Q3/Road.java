package Midterm.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

enum Direction {
    WEST_TO_EAST,
    EAST_TO_WEST,
    NORTH_TO_SOUTH,
    SOUTH_TO_NORTH
}
public class Road {
    private int length;
    private int width;
    private Direction direction;
    private List<Vehicle> vehicles;

    public Road(int length, int width, Direction direction) {
        this.length = length;
        this.width = width;
        this.direction = direction;
        this.vehicles = new ArrayList<>();
    }

    public Direction getDirection() {
        return direction;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public void move(Vehicle vehicle) {
        Random random = new Random();
        int vehicleSize = vehicle.getSize();
        int vehicleSpeed = random.nextInt(vehicle.getSpeed());

        int position = random.nextInt(length - vehicleSize + 1);

        while (position < length) {
            position += vehicleSpeed;

            if(position >= length) {
                removeVehicle(vehicle);
                break;
            }
        }
    }



}
