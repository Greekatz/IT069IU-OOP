package Lab4;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
public class CrossLine extends JPanel {
    // draws an X
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // draw a line from the upper-left to the lower-right
        g.drawLine(0, 0, width, height);

        // draw a line from the lower-left to the upper-right
        g.drawLine(0, height, width, 0);

        int centerx = width / 2;
        int centery = height / 2;

        // draw a cross
        g.drawLine(0, centery, width, centery);
        g.drawLine(centerx, 0, centerx, height);

    }
}
