package org.example.calcurator;

public class Confilct1 {

  int left;
  int right;

  int mid;

  public Confilct1(int left, int right, int mid) {
    this.left = left;
    this.right = right;
    this.mid = mid;
  }

  public int result() {
    return left + right + mid;
  }
}
