package Lab3.Q2;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(6, 6, 12, 12, -6, -6);
        System.out.println("Triangle 1:" + triangle1.getType());
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println(triangle1.toString());

        MyTriangle triangle2 = new MyTriangle(0, 0 ,0 ,0 ,0, 0);
        System.out.println(triangle2.getType());

        MyTriangle triangle3 = new MyTriangle(1,1,1,1,-1,-1);
        System.out.println(triangle3.getType());
    }
}
