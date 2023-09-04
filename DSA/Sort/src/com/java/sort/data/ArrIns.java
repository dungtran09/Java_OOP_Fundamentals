package com.java.sort.data;

public class ArrIns {
    private long[] numsArr;
    private int noOfElems;

    public ArrIns(int max) {
        this.numsArr = new long[max];
        this.noOfElems = 0;
    }

    public void insert(long value) {
        this.numsArr[this.noOfElems] = value;
        this.noOfElems++;
    }

    public void display() {
        for (int i = 0; i < this.noOfElems; i++) {
            System.out.print(this.numsArr[i] + " ");
        }
        System.out.println(" ");
    }

    public void sort() {
        int currRightIndex, currLeftIndex;
        
        for (currRightIndex = 1; currRightIndex < this.noOfElems; currRightIndex++) {
            long currElement = this.numsArr[currRightIndex];
            currLeftIndex = currRightIndex;
            while (currLeftIndex > 0 && this.numsArr[currLeftIndex - 1] >= currElement) {
                this.numsArr[currLeftIndex] = this.numsArr[currLeftIndex - 1];
                --currLeftIndex;
            }
            this.numsArr[currLeftIndex] = currElement;
        }
    }
}
