package Lab2;

public enum Direction {
    NORTH(-1, 0),
    SOUTH(1, 0),
    WEST(0, -1),
    EAST(0 , 1),
    NORTHEAST(-1 ,1),
    NORTHWEST(-1, -1),
    SOUTHWEST(1, -1),
    SOUTHEAST(1, 1);

    private int deltaY;
    private int deltaX;

    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public int getDeltaX() {
        return deltaX;
    }
}
