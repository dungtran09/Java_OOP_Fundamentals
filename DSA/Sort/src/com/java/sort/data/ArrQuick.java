package com.java.sort.data;

/**
 * ArrQuick
 */

public class ArrQuick {
    private long[] arr;
    private int noOfElems;
    private int start;

    public ArrQuick(int max) {
        this.arr = new long[max];
        this.noOfElems = 0;
        this.start = 0;
    }

    public void insert(long value) {
        this.arr[noOfElems] = value;
        this.noOfElems++;
    }

    public void display() {
        for (int i = 0; i < this.noOfElems; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println(" ");
    }

    public void sort() {
        sort(this.arr, this.start, this.noOfElems - 1 );
    }

    private void sort(long[] arr, int start, int end) {
        if (start >= end) {
            return;
        } 
        int indexPartition = findPartition(arr, start, end);
        sort(arr, start, indexPartition - 1);
        sort(arr, indexPartition + 1, end);
    }

    private int findPartition(long[] arr, int start, int end) {
        int partitionIndex = start;
        long pivotElement = arr[end];
        for (int index = start; index < end; index++) {
            if (arr[index] <= pivotElement) {
                swap(arr, index, partitionIndex);
                partitionIndex++;   
            }
        }
        swap(arr, partitionIndex, end);
        return partitionIndex;
    }

    private void swap(long[] arr, int firstIndex, int secondIndex) {
        long temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
