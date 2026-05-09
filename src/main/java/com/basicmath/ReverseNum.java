package com.basicmath;

public class ReverseNum {

  void main() {
    int n = -123;

    var revNum = 0;

    while (n > 0) {
      revNum = (n % 10) + revNum * 10;

      n = n / 10;
    }

    IO.println(revNum);

    IO.println(reverse(n));
  }

  public int reverse(long n) {
    long revNum = 0;
    var isNegative = false;

    if (n < 0) {
      n = n * -1L;
      isNegative = true;
    }

    while (n > 0) {
      revNum = (n % 10L) + revNum * 10L;
      n = n / 10;
    }

    if (revNum > Integer.MAX_VALUE) {
      return 0;
    }

    return isNegative ? (int) revNum * -1 : (int) revNum;
  }

}