package Lab1.Q3;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(3.0, 6.0);
        Point point2 = new Point(5, 3);

        double distance = point1.distance(point2);

        System.out.println("Distance between 2 points is: " + distance);
    }
}
