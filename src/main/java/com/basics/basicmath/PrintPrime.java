package com.basics.basicmath;

public class PrintPrime {

  public void checkPrimeNaive(int n) {
    var count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    if (count == 2) {
      IO.println(n + " is Prime");
    } else {
      IO.println(n + " is not Prime");
    }
  }

  public void checkPrimeEfficient(int n) {
    boolean isPrime = true;

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      System.out.println(n + " is Prime");
    } else {
      System.out.println(n + " is not Prime");
    }

  }


  void main() {
    checkPrimeNaive(12);
    checkPrimeNaive(1769);
    checkPrimeNaive(341);
    checkPrimeNaive(101);
    checkPrimeNaive(997);

    IO.println();

    checkPrimeEfficient(12);
    checkPrimeEfficient(1769);
    checkPrimeEfficient(341);
    checkPrimeEfficient(101);
    checkPrimeEfficient(997);
  }

}
