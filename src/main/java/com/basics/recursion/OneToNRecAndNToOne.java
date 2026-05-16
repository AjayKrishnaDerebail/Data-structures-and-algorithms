package com.basics.recursion;

public class OneToNRecAndNToOne {

  /**
   * Tail recursion
   */
  public void printNumNtoOne(int num) {

    if (num == 0) {
      IO.println("Hit base condition");
      return;
    }

    IO.println(num);
    num--;
    printNumNtoOne(num);

  }

  /**
   * Tail recursion
   */
  public void printNumOneToN(int num) {

    if (num == 1) {
      IO.println("Hit base condition");
      return;
    }

    num--;
    printNumOneToN(num);
    IO.println(num);

  }

  void main() {
    printNumNtoOne(10);
    printNumOneToN(10);
  }

}
