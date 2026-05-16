package com.basics.recursion;

public class SumRec {

  int sum(int n) {

    if (n == 0) {
      return 0;
    }

    return sum(n - 1) + n;

  }

  void main() {
    IO.println(sum(10));
  }

}