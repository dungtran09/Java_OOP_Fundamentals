package com.java.data;

public class List<Type> {
    private Type[] list;
    private int size;

    public List() {
        this.list = (Type[]) new Object[10]; 
        this.size = 0;
    }

    public void add(Type value) {
        if (this.size == this.list.length) {
            grow();
        }
        this.list[this.size] = value;
        this.size++;
    }
    
    private void grow() {
        int newSize = this.list.length + this.list.length / 2;
        Type[] newList = (Type[]) new Object[newSize];
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        this.list = newList;
    }

    public boolean contains(Type value) {
        return index(value) >= 0;
    }

    public int index(Type value) {
        for (int i = 0; i < this.size; i++) {
            if (this.list[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveList(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.list[i] = this.list[i+1];
        }
        this.size--;
    }

    public int remove(Type value) {
        int index = index(value);

        if (index < 0) {
            return -1;
        } else {
            moveList(index);
            return 1;
        }
    }

    public Type value(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0 -> ] " + this.size + "] ");
        }
        return this.list[index];
    }
    
    public int size() {
        return this.size;
    }


}
