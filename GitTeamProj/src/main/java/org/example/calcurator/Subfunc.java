package org.example.calcurator;

public class Subfunc {
    int left;
    int right;

    public Subfunc(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int result() {
        return left - right;
    }
}
