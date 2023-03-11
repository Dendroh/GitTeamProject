package org.example.calcurator;

public class Meanfunc {

    double left, right;

    public Meanfunc(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double result() {
        System.out.print("mean result: ");
        return (left + right) / 2;
    }
}
