package Lab6.ex2;

import java.util.Objects;

public class Key {
    private int key;

    public Key(int k) {
        this.key = k;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Key key1 = (Key) object;
        return key == key1.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}