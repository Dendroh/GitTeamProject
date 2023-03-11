package org.example.calcurator;

public class Confilct1 {

  int left;
  int right;

  int center;

  public Confilct1(int left, int right, int center) {
    this.left = left;
    this.right = right;
    this.center = center;
  }

  public int result() {
    return left + right + center;
  }
}
