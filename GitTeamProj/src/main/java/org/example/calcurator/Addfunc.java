package org.example.calcurator;

public class Addfunc {
  int left;
  int right;

  public Addfunc(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int result() {
    System.out.println("result");
    System.out.println("result2");
    System.out.println("addtest");
    return left + right;
  }
}
