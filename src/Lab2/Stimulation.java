package Lab2;
import java.util.Random;
import java.util.List;


public class Stimulation {
    private Box box;

    public Stimulation(Box box) {
        this.box = box;
    }


    public void run(int steps) {

        for (int i = 1; i <= steps; i++){
            System.out.println("Step " + i + ":");
            moveParticles();
            showParticleCount();
            visualizeBox();
            System.out.println();


        }
    }

    public void moveParticles() {
        List<Particle> particles = Particle.getParticles();
        int Particles = particles.size();
        Random random = new Random();

        for (int i = 0; i < Particles; i++) {
            Particle particle = particles.get(i);
            particle.move(); // Make the particle move
            for (int j = i + 1; j < Particles; j++) {
                Particle otherParticle = particles.get(j);
                if (particle.collides(otherParticle)) {
                    // Collision detected
                    int randX = random.nextInt(box.getWidth() + 1);
                    int randY = random.nextInt(box.getHeight() + 1);
                    Particle newParticle = new Particle(randX, randY, box);
                    box.addParticle(newParticle);
                }
            }
        }
    }


    private void showParticleCount() {
        int particleCount = box.getParticles().size();
        System.out.println("Number of particles in the box: " + particleCount);
    }

    private void visualizeBox() {
        box.createBox();
    }

    public static void main(String[] args) {
        Box box = Box.getBox();
        box.setDimension(9, 8);
        Particle particle1 = new Particle(3, 4, box);
        Particle particle2 = new Particle(3, 4, box);
        Particle particle3 = new Particle(5, 4, box);
        box.addParticle(particle1);
        box.addParticle(particle2);
        box.addParticle(particle3);
        Stimulation stimulation = new Stimulation(box);
        stimulation.run(19);
    }
}