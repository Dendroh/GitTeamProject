package org.example.calcurator;

public class Confilct4 {

  int left;
  int right;
  int last;

  public Confilct4(int left, int right, int last) {
    this.left = left;
    this.right = right;
    this.last = last;
  }

  public int result() {
    return left + right + last;
  }
}
