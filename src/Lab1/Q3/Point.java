package Lab1.Q3;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point target) {
        double dx = x - target.x;
        double dy =  y - target.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
