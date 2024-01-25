package DesignPatterns.Observer;

public class Test {
    public static void main(String[] args) {
        MyData data = new MyData();
        data.setA(10);
        data.setB(5);
        data.setC(20);

        BarChart bar = new BarChart(data);

        bar.draw();

        MyTable table = new MyTable(data);
        table.showTable();

        System.out.println("Change A to 30");
        table.setA(30);

        System.out.println("Change B to 50");
        bar.setB(50);
    }
}
