package ru.sysoevm.map;

public class Entry<K, V> {
    public K key;
    public V value;
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

}
