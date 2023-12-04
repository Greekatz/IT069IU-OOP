package Midterm.Q4;

public class B extends A {
    public B() {
        System.out.println("ctor B");
        value = 20;
    }

    public void print() {
        System.out.println(value);
    }

    public static void test() {
        B b = new B();
        b.print();
    }

    public static void main(String[] args) {
        test();
    }
}

