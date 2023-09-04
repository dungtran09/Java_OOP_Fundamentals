package com.java.sort.data;

/**
 * ArrMerge
 */
public class ArrMerge {
    private long[] arr;
    private int noOfElement;

    public ArrMerge(int max) {
        this.arr = new long[max];
        this.noOfElement = 0;
    }

    public void insert(long value) {
        this.arr[noOfElement] = value;
        this.noOfElement++;
    }

    public void display() {
        for (int i = 0; i < this.noOfElement; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    
    public void sort() {
        sort(this.arr);
    }

    private void sort(long[] arr) {
        int noOfElement = arr.length; 
        if (noOfElement < 2) {
            return;
        }
        
        int mid = noOfElement / 2;
        long[] leftSubArr = new long[mid];
        long[] rightSubArr = new long[noOfElement - mid];
        
        for (int index = 0; index < mid; index++) {
            leftSubArr[index] = arr[index];
        }

        for (int index = mid; index < noOfElement; index++) {
            rightSubArr[index - mid] = arr[index]; 
        }

        sort(leftSubArr);
        sort(rightSubArr);
        mergeSort(arr, leftSubArr, rightSubArr);
    }

    private void mergeSort(long[] arr, long[] leftSubArr, long[] rightSubArr) {
        int indexArr = 0, leftSubArrIndex = 0, rightSubArrIndex = 0;

        while ((leftSubArrIndex < leftSubArr.length) && (rightSubArrIndex < rightSubArr.length)) {
            if (leftSubArr[leftSubArrIndex] < rightSubArr[rightSubArrIndex]) {
                arr[indexArr] = leftSubArr[leftSubArrIndex];
                leftSubArrIndex++;
            } else {
                arr[indexArr] = rightSubArr[rightSubArrIndex];
                rightSubArrIndex++;
            }
            indexArr++;
        }

        while (leftSubArrIndex < leftSubArr.length) {
            arr[indexArr] = leftSubArr[leftSubArrIndex];
            indexArr++;
            leftSubArrIndex++;
        }
        while (rightSubArrIndex < rightSubArr.length) {
            arr[indexArr] = rightSubArr[rightSubArrIndex];
            indexArr++;
            rightSubArrIndex++;
        }
    }
    
}
