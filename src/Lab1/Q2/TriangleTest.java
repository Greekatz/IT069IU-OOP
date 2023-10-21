package Lab1.Q2;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5, 4 ,3);
        Triangle triangle2 = new Triangle(-5,-2,0);
        Triangle triangle3 = new Triangle(5 ,5 ,5);

        TriangleType type1  = triangle1.getType();
        TriangleType type2 = triangle2.getType();
        TriangleType type3 = triangle3.getType();
        System.out.println("Triangle1 Type: " + type1);
        System.out.println("Triangle2 Type: " + type2);
        System.out.println("Triangle3 Type: " + type3);
    }
}
