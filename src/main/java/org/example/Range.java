package org.example;

public class Range {
    private int low;
    private int high;

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public  Range(int low, int high){
        this.low = low;
        this.high = high;
    }
}