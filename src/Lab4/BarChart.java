package Lab4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class BarChart {
    private int[] numbers;

    public BarChart(int[] numbers) {
        this.numbers = numbers;
    }
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void drawChart() {
        JPanel chartPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Set up colors for the rectangles
                Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.PINK};

                int x = 10;
                int width = 20;
                int heightMultiplier = 10;


                for (int i = 0; i < numbers.length; i++) {
                    int height = numbers[i] * heightMultiplier;
                    g.setColor(colors[i % colors.length]);
                    g.fillRect(x, getHeight() - height, width, height);
                    x += width + 10;
                }
            }
        };

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.getContentPane().add(chartPanel);
        frame.setVisible(true);
    }
}
