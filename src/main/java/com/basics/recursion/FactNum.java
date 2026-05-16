package com.basics.recursion;

public class FactNum {

  int fact(int n) {

    if(n < 0)
      return 0;

    if (n == 1) {
      return 1;
    }

    return fact(n - 1) * n;

  }

  void main() {
    IO.println(fact(10));
  }


}
