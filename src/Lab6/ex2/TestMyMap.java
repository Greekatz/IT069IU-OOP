package Lab6.ex2;

public class TestMyMap {
    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap<Integer, String>();
        myMap.put(21, "Hung");
        myMap.put(20, "Hùng");
        System.out.println(myMap.get(21));
    }
}
