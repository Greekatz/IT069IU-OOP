package Lab3.Q1;
import javax.swing.JFrame;

public class TestShape {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500,500);
        app.setVisible(true);
    }
}

