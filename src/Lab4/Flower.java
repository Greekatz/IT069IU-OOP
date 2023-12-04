package Lab4;

import javax.swing.JPanel;
import java.awt.Graphics;
public class Flower extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int incrementWidth = width / 15;
        int incrementHeight = height / 15;

        int steps = 15;
        int i = 0;
        while (i < 15) {
            // Bottom Left
            g.drawLine(0,incrementHeight * i,  incrementWidth + incrementWidth * i, height);

            // Bottom right
            g.drawLine(width, incrementHeight* i , width - incrementWidth * i, height);

            // Upper right
            g.drawLine(incrementWidth + incrementWidth * i , 0, width, incrementHeight * i);

            // Upper left
            g.drawLine(width - incrementWidth * i, 0 , 0, incrementHeight * i);
            i++;
        }
    }
}
