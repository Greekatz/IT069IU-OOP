package Lab3.Q1;


import java.awt.Color;
import java.awt.Graphics;

abstract class MyShape {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

    public MyShape(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = color;
    }

    public abstract void draw(Graphics g);

    public int getX1() {
        return x1;
    }


    public int getY1() {
        return y1;
    }


    public int getX2() {
        return x2;
    }


    public int getY2() {
        return y2;
    }


    public Color getColor() {
        return color;
    }


}
