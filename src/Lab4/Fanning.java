package Lab4;
import javax.swing.JPanel;
import java.awt.Graphics;
public class Fanning extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int incrementWidth = width / 15;
        int incrementHeight = height / 15;

        int steps = 15;
        int i = 0;
        while (i < steps) {
            g.drawLine(0, 0, incrementWidth * i, height - incrementHeight * i );
            // Top right corners
            g.drawLine(width,0, width - incrementWidth * i, height - incrementHeight * i);
            // Down left corners
            g.drawLine(0, height, width - incrementWidth * i, height - incrementHeight * i);
            // Down right corners
            g.drawLine(width, height, incrementWidth * i ,height - incrementHeight * i);

            i++;
        }
    }
}