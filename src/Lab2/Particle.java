package Lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Particle {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private static List<Particle> particles = new ArrayList<>();
    private Box box;

    // Constructor
    public Particle(int x, int y, Box box) {
        this.x = x;
        this.y = y;
        this.box = box;
        particles.add(this);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0 && x <= box.getWidth()) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("The x-coordinate should be lesser or equal to the box width");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0 && y <= box.getHeight()) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("The y-coordinate should be lesser or equal to the box height");
        }
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    private Direction getRandomDirection() {
        Random random = new Random();
        Direction[] directions = Direction.values();
        int randomDirection = random.nextInt(directions.length);
        return directions[randomDirection];
    }

    // Make the particle move randomly
    public void move() {
        Direction randomDirection = getRandomDirection();

        dx = randomDirection.getDeltaX();
        dy = randomDirection.getDeltaY();

        x += dx;
        y += dy;

        if (x >= box.getWidth()) {
            x = box.getWidth() - 1;
        } else if (x < 0) {
            dx = -dx;
            x = 1;
        }

        if (y >= box.getHeight()) {
            y = box.getHeight() - 1;
        } else if (y < 0) {
            dy = -dy;
            y = 1;
        }
    }

    public static List<Particle> getParticles() {
        return particles;
    }

    public boolean collides(Particle otherParticle){
        return this.x == otherParticle.x && this.y == otherParticle.y;
    }



}