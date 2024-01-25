package Lab6.ex2;

import java.util.LinkedList;

public class ObjectMap {
    LinkedList<Entry>[] myHashMap = new LinkedList[2];
    int size = 0;
    public ObjectMap() {

    }

    public void put(Key key, Value value) {
        if(size >= myHashMap.length) {
            resize();
        }

        int index = getIndex(key) % myHashMap.length;

        if(myHashMap[index] == null) {
            myHashMap[index] = new LinkedList<>();
            myHashMap[index].add(new Entry(key, value));
            size++;
            return;
        } else {
            for(Entry entry : myHashMap[index]) {
                if(entry.key.equals(key)) {
                    entry.value = value;
                    size++;
                    return;
                }
            }
        }
    }

    public Value get(Key key) {
        int index = getIndex(key) % myHashMap.length;
        if(myHashMap[index] == null) return null;

        for (Entry entry : myHashMap[index]) {
            if(entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void resize(){
        LinkedList<Entry>[] oldMap = myHashMap;
        myHashMap = new LinkedList[size * 2];
        size = 0;

        for (int i = 0; i < oldMap.length; i++) {
            if (oldMap[i] == null) continue;
            for(Entry entry : oldMap[i]) {
                put(entry.key, entry.value);
            }
        }
    }

    public int getIndex(Key key) {
        return key.hashCode();
    }

}
