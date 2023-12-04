package Lab4;
import javax.swing.JPanel;
import java.awt.Graphics;
public class Spiral extends JPanel {

    private int width;
    private int height;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        width = getWidth();
        height = getHeight();
        SquareSpiral(g);

    }

    public void SquareSpiral(Graphics g) {
        int centerX = width / 2;
        int centerY = height / 2;
        int lineLength = 15;
        int lineIncrement = 5;
        int direction = 0;

        while (lineLength < Math.min(width, height)) {
            switch (direction) {
                case 0: //down
                    g.drawLine(centerX, centerY, centerX, centerY +lineLength);
                    centerY += lineLength;
                    break;
                case 1: // left
                    g.drawLine(centerX,centerY, centerX - lineLength, centerY);
                    centerX -= lineLength;
                    break;
                case 2: // up
                    g.drawLine(centerX, centerY, centerX, centerY - lineLength);
                    centerY -= lineLength;
                    break;
                case 3: // right
                    g.drawLine(centerX, centerY, centerX + lineLength, centerY);
                    centerX += lineLength;
                    break;

            }
            lineLength += lineIncrement;
            direction = (direction + 1) % 4;
        }
    }

}
