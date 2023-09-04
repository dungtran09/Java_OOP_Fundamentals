package com.java.sort.data;

/**
 * ArrSel
 */
public class ArrSel {
    private long[] numsArr;
    private int noOfElements;

    public ArrSel(int max) {
        this.numsArr = new long[max];
        this.noOfElements = 0;
    }
        
    public void insert(long value) {
        this.numsArr[noOfElements] = value;
        this.noOfElements++;
    }

    public void display() {
        for (int i = 0; i < this.noOfElements; i++) {
            System.out.print(this.numsArr[i] + " ");
        }
        System.out.println(" ");
    }

    public void sort() {
        int currOutIndex, currInIndex , currMinIndex;

        for (currOutIndex = 0; currOutIndex < this.noOfElements - 1; currOutIndex++) {
            currMinIndex = currOutIndex;
            for (currInIndex = currOutIndex + 1; currInIndex < this.noOfElements; currInIndex++) {
                if (this.numsArr[currInIndex] < this.numsArr[currMinIndex]) {
                    currMinIndex = currInIndex;
                }
            }
            swap(currOutIndex, currMinIndex);
        }

    }

    private void swap(int firstNum, int secondNum) {
        long tempElement = this.numsArr[firstNum];
        this.numsArr[firstNum] = this.numsArr[secondNum];
        this.numsArr[secondNum] = tempElement;
    }

    
}
