package Lab3.Q2;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        super();
    }


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(MyPoint other) {
        return Math.hypot(other.x - x, other.y - y);
    }


}
