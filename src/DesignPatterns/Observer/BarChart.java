package DesignPatterns.Observer;

public class BarChart implements Observer {
    private MyData data;

    public BarChart(MyData data) {
        this.data = data;
        data.attach(this);
    }

    public void draw() {
        System.out.print(data.getA() + ": ");
        for (int i = 0; i < data.getA(); i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(data.getB() + ": ");
        for (int i = 0; i < data.getB(); i++) {
            System.out.print("O");
        }
        System.out.println();

        System.out.print(data.getC() + ": ");
        for (int i = 0; i < data.getC(); i++) {
            System.out.print("[]");
        }
        System.out.println();
    }

    public void setB(int x) {
        data.setB(x);
        // Table.update();
        // Table.showTable();
    }

    @Override
    public void update() {
        this.draw();
    }
}
