package com.java.data;

public class HashMapFake<K, V> {
    private List<Pair<K, V>>[] list;
    private int size;

    public HashMapFake(K key, V Value) {
        this.list = new List[32];
        this.size = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.list.length);
        if (this.list[hashValue] == null) return null;

        List<Pair<K, V>> valuesAtIndex = this.list[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if(valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;
    }

    private List<Pair<K, V>> getListBaseOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.list.length);

        if(list[hashValue] == null) {
            list[hashValue] = new List<>();
        }
        return list[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if(myList.value(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBaseOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if(index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.size++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
    }
}
