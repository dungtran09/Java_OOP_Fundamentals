package com.java.sort.data;

public class ArrInObject {
    private Person[] arr;
    private int size;

    public ArrInObject(int maxSize) {
        this.arr = new Person[maxSize];
        this.size = 0;
    }

    public void insert(String firstName, String lastName, int age) {
        this.arr[size] = new Person(firstName, lastName, age);
        this.size++;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            this.arr[i].displayPerson();
        }
    }

    public void sort() {
        int currentRightIndex, currentLeftIndex;

        for (currentRightIndex = 1; currentRightIndex < this.size; currentRightIndex++) {
            Person currentElement = this.arr[currentRightIndex];
            currentLeftIndex = currentRightIndex;
            while ((currentLeftIndex > 0) && (this.arr[currentLeftIndex - 1].getLastName().compareTo(currentElement.getLastName()) > 0)) {
                this.arr[currentLeftIndex] = this.arr[currentLeftIndex - 1];
                --currentLeftIndex;
            }
            this.arr[currentLeftIndex] = currentElement;
        }
    }

} 
