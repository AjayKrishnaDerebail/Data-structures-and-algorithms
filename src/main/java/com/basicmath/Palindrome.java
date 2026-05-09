package com.basicmath;

public class Palindrome {

  void main() {
    IO.println(isPalindrome(121));
  }

  public boolean isPalindrome(int x) {

    int rev = 0;
    int num = x;

    if (x < 0) {
      return false;
    }

    while (x > 0) {
      rev = (x % 10) + rev * 10;
      x = x / 10;
    }

    System.out.println(rev);

    return rev == num;

  }

}
