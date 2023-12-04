package Lab4;

import javax.swing.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose exercise from (1- 6): ");

        int exercise = scanner.nextInt();
        switch (exercise) {
            case 1:
                Exercise1();
                break;
            case 2:
                Exercise2();
                break;
            case 3:
                Exercise3();
                break;
            case 4:
                Exercise4();
                break;
            case 5:
                Exercise5();
                break;
            case 6:
                Exercise6();
                break;
        }
    }

    private static void displayFrame(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }

    private static void Exercise1() {
        InputListener input = new InputListener();
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        input.setName(name);

        String storedName = input.getName();
        JOptionPane.showMessageDialog(null, "Welcome, " + storedName + ", to Java programming");
    }

    private static void Exercise2() {
        CrossLine crossLine = new CrossLine();
        JFrame frame = new JFrame();
        frame.add(crossLine);
        displayFrame(frame);
    }

    private static void Exercise3() {
        Fanning fanning = new Fanning();
        JFrame frame = new JFrame();
        frame.add(fanning);
        displayFrame(frame);
    }

    private static void Exercise4() {
        Flower flower = new Flower();
        JFrame frame = new JFrame();
        frame.add(flower);
        displayFrame(frame);
    }

    private static void Exercise5() {
        Spiral squareSpiral = new Spiral();
        JFrame squareFrame = new JFrame();
        squareFrame.add(squareSpiral);
        displayFrame(squareFrame);

    }

    private static void Exercise6() {
        int[] numbers = {8, 5, 3, 9, 4};
        BarChart barChart = new BarChart(numbers);
        barChart.drawChart();
    }
}