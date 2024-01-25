package Lab6.ex2;

public class TestObjectMap {
    public static void main(String[] args) {
        ObjectMap map = new ObjectMap();
        map.put(new Key( 21), new Value(20));
        map.put(new Key(40), new Value(19));
        System.out.println(map.get(new Key(40)).getValue());
    }
}
