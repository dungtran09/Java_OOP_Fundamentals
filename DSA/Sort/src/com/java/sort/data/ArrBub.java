package com.java.sort.data;

public class ArrBub {
    private long[] numsList;
    private int size;

    public ArrBub(int max) {
        this.numsList = new long[max];
        this.size = 0;
    }

    public void insert(long value) {
        this.numsList[size] = value;
        this.size++;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.numsList[i] + " ");
        }
        System.out.println(" ");
    }

    public void sort() {
        int currOutIndex, currInIndex;
        boolean flag;
        for (currOutIndex = this.size - 1; currOutIndex > 1; currOutIndex--) {
            flag = false;
            for (currInIndex = 0; currInIndex < currOutIndex; currInIndex++) {
                if (this.numsList[currInIndex] > this.numsList[currInIndex + 1]) {
                    swap(currInIndex, currInIndex + 1);
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }

    private void swap(int firstNum, int secondNum) {
        long tempElement = this.numsList[firstNum];
        this.numsList[firstNum] = this.numsList[secondNum];
        this.numsList[secondNum] = tempElement;
    }
}
