package Lab6.ex2;

public class Value {
    private int value;
    public Value(int value) {
        this.value = value;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Value value1 = (Value) object;
        return value == value1.value;
    }
    public int getValue() {
        return value;
    }
}
