package main.list.imple;

import main.list.GBList;

public class GBArrayList<T implements GBList<T>> {
    private int size;
    private T[] values;
    private int capacity;

    public GBArrayList() {
        this.size = 0;
        this.capacity = 2;
        this.values = (T[]) new Comparable[capacity]();
    }
}
