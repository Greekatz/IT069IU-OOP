package Lab1.Q1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
            if (width < 0 || height < 0) {
                throw new IllegalArgumentException("Error: The magnitude cannot be less than 0");
            }
            else {
                this.width = width;
                this.height = height;
            }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void createRec() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

}
