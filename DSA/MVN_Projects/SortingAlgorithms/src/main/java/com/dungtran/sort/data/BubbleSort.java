package com.dungtran.sort.data;

import java.util.Arrays;

public class BubbleSort {
    private long[] arr;
    private int size;

    public BubbleSort(int max) {
        this.arr = new long[max];
        this.size = 0;
    }

    public void insert(int value) {
        this.arr[size] = value;
        this.size++;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public void sort() {
        int out, in;

        for (out = size; out > 1; out--) {
            for (in = 0; in < this.size; in++) {
                if (arr[in] > arr[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int firstNum, int secondNum) {
        long temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;
    }
}
