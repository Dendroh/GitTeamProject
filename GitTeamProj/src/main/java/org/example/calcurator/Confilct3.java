package org.example.calcurator;

public class Confilct3 {

  int left;
  int right;
  int middle;

  public Confilct3(int left, int right,int middle) {
    this.left = left;
    this.right = right;
    this.middle = middle;
  }

  public int result() {
    System.out.println("result(값): " + left + right + middle);
    return left + right + middle;
  }
}
