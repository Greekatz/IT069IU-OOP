package DesignPatterns.Facade;

public class FacadeDemo {

    public static void main(String[] args) {
        Line lineA = new Line(new Point(2, 4), new Point(5, 7));
        lineA.move(-2, -4);
        System.out.println("after move: " + lineA);
        lineA.rotate(45);
        System.out.println("after rotate: " + lineA);
        Line lineB = new Line(new Point(2, 1), new Point(2.866, 1.5));
        lineB.rotate(30);
        System.out.println("30 degrees to 60 degrees: " + lineB);
    }
}
