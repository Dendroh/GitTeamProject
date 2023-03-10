package org.example.calcurator;

public class Addfunc {
  int left;
  int right;

  public Addfunc(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int result() {
    return left + right;
  }
}
