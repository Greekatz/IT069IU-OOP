package Lab3.Q1;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
public class DrawPanel extends JPanel {
    private SecureRandom randomNumbers = new SecureRandom();
    private MyShape[] shapes = new MyShape[5];

    public DrawPanel() {
        setBackground(Color.WHITE);
        shapes = drawRandomShapes();
    }

    private MyShape[] drawRandomShapes() {
        for (int i = 0; i < shapes.length; i++) {
            int shapeType = randomNumbers.nextInt((3) + 1);
            int x1 = randomNumbers.nextInt(300 + 100);
            int x2 = randomNumbers.nextInt(300 + 100);
            int y1 = randomNumbers.nextInt(300 + 100);
            int y2 = randomNumbers.nextInt(300 + 100);

            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256));

            String type = "";
            MyShape shape = null;

            switch (shapeType) {
                case 1:
                    shape = new MyLine(x1, y1, x2, y2, color);
                    type = "Line";
                    break;
                case 2:
                    shape = new MyOval(x1, y1, x2, y2, color);
                    type = "Oval";
                    break;
                case 3:
                    shape = new MyRectangle(x1, y1, x2, y2, color);
                    type = "Rectangle";
                    break;
            }

            if (shape != null) {
                shapes[i] = shape;
                if (shape instanceof MyBoundedShape) {
                    MyBoundedShape boundedShape = (MyBoundedShape) shape;
                    double area = boundedShape.getArea();
                    System.out.println("Area of shape " + type + (i+1) + ": " + area);
                }

//                if (shape instanceof MyBoundedShape boundedShape) {
//                    double area = boundedShape.getArea(); // Pattern Matching
//                    System.out.println("Area of shape " + type + (i+1) + ": " + area);
//                }
            } else {
                i--; // Retry the current index
            }
        }

        return shapes;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (MyShape shape : shapes) {
            if (shape != null) {
                shape.draw(g);
            }
        }

    }


} // end class draw panel
