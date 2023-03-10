package org.example.calcurator;

public class Remainfunc {

  int left;
  int right;

  public Remainfunc(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int result() {

    return left % right;
  }
}
