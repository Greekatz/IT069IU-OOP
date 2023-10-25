package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private static Box box;
    private int width;
    private int height;
    private List<Particle> particles;

    private Box() {
        particles = new ArrayList<>();
    }


    // Singleton Pattern
    public static Box getBox() {
        if (box == null) {
            box = new Box();
        }
        return box;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    // Set the dimension for the box
    public void setDimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Generate random particles in a valid position
    private boolean isValidPosition(int x, int y) {
        return x >= 1 && x < width - 1 && y >= 1 && y < height - 1;
    }


    // Function to add particle
    public void addParticle(Particle particle) {
        particles.add(particle);
    }

    public void createBox() {
        String[][] box = new String[height][width];

        // Visualize the box
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    box[i][j] = "-";
                } else if (j == 0 || j == width - 1) {
                    box[i][j] = "|";
                } else {
                    box[i][j] = " ";
                }
            }
        }

        // Add particles into the box
        for (Particle particle : particles) {
            int x = particle.getX();
            int y = particle.getY();
            if (isValidPosition(x, y)) {
                box[x][y] = "*";
            }
        }

        // Print the box and particles
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(box[i][j]);
            }
            System.out.println();
        }
    }

    public List<Particle> getParticles() {
        return particles;
    }
}