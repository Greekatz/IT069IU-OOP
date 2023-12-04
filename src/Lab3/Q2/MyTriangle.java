package Lab3.Q2;


public class MyTriangle extends MyPoint {

    enum TriangleType {
        EQUILATERAL,
        ISOSCELES,
        SCALENE,
        INVALID
    }

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

   
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }


    public String toString() {
        return String.format("v1 = (%d, %d), v2 = (%d, %d), v3 = (%d, %d)",
                v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getY());
    }

    public double getPerimeter() {
        return distance(v1) + distance(v2) + distance(v3);
    }

    public TriangleType getType() {
        if (distance(v1) <= 0 || distance(v2) <= 0 || distance(v3) <= 0) {
            return TriangleType.INVALID;
        }

        else if (distance(v1) == distance(v2) && distance(v2) == distance(v3)) {
            return TriangleType.EQUILATERAL;
        } else if (distance(v1) == distance(v2) || distance(v1) == distance(v3) || distance(v2) == distance(v3)) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }


}

