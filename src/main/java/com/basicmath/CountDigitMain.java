package com.basicmath;

import static java.lang.Math.log10;

public class CountDigitMain {

  void main() {

    long n = 1234567899999999999L;

    bruteForce(n);

    optimalApproach(n);

  }

  /**
   * Brute Force approach gives time complexity of log(n) base 10
   */
  private void bruteForce(long n) {

    int count = 0;

    while (n > 0) {
      count++;
      n = n / 10;
    }

    IO.println(count);

  }

  private void optimalApproach(long n){
    int count = (int) log10(n) + 1;

    IO.println(count);

  }

}