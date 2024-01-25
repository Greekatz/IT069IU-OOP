package DesignPatterns.Observer;

public class MyTable implements Observer {
    private MyData data;
    public MyTable(MyData data) {
        this.data = data;

    }

    public void showTable() {
        System.out.println("A: " + data.getA());
        System.out.println("B: " + data.getB());
        System.out.println("C: " + data.getC());
    }

    public void setA(int x) {
        data.setA(x);
    }

    public void update() {
        System.out.println("Updated on change");
        this.showTable();
    }
}
