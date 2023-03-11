package org.example.calcurator;

public class Maxfunc {
    int left;
    int right;

    public Maxfunc(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int result() {
        if (left >= right) {
            System.out.println("result: " + left);
            return left;
        } else {
            System.out.println("result: " + right);
            return right;
        }
    }
}
