package Lab3.Q1;

import java.awt.Graphics;
import java.awt.Color;

abstract class MyBoundedShape extends MyShape {


    public MyBoundedShape(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, x2, y2, color);
    }

    @Override
    public abstract void draw(Graphics g);

    public abstract double getArea();
}
