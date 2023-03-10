package org.example.calcurator;

public class Minfunc {
  int left;
  int right;

  public Minfunc(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int result() {
    return left < right ? left : right;
  }
}
