package Lab6.ex2;

public class MyMap<K, V> {

    private Entry<K, V>[] table;
    private int SIZE = 5;

    private class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K,V> next;

        public Entry(K key, V value, Entry<K,V> next) {
            this.key = key;
            this.value = value;
            this.next = next;

        }


        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

    }
    public MyMap() {
        table = new Entry[SIZE];
    }

    public void put(K newKey, V value) {
        int hash = newKey.hashCode() % SIZE;
        Entry<K,V> newEntry = new Entry<K,V>(newKey, value, null);

        if (table[hash] == null)  {
            table[hash] = newEntry;
        } else {
            Entry<K,V> pre = null;
            Entry<K,V> current = table[hash];

            while (current != null) {
                if(current.key.equals(newKey)) {
                    if(pre == null) {
                        newEntry.next = current.next;
                        table[hash] = newEntry;
                        return;
                    } else {
                        newEntry.next = current.next;
                        pre.next = newEntry;
                        return;
                    }
                }
                pre = current;
                current = current.next;
            }
            pre.next = newEntry;
        }

    }

    public V get(K key) {
        int hash = key.hashCode() % SIZE;
        if(table[hash] == null) {
            return null;
        } else {
            Entry<K,V> temp = table[hash];
            while (temp != null) {
                if(temp.key.equals(key))
                    return temp.value;
                temp = temp.next;
            }
            return null;
        }
    }




}