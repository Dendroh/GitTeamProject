package org.example.calcurator;

public class Confilct4 {

  int left;
  int right;
  int last_num;

  public Confilct4(int left, int right, int last_num) {
    this.left = left;
    this.right = right;
    this.last_num = last_num;
  }

  public int result() {
    return left + right + last_num;
  }
}
