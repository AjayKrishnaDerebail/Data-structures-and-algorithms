package com.basics.basicmath;

public class PrintDivisors {

  public void printDivisorsNaive(int n) {
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
    IO.println();
  }

  public void printDivisorsEfficient(int n) {
    if (n <= 0) {
      return;
    }

    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");

        // If the divisors are not the same (e.g., not 6*6), print the partner
        if (i != n / i) {
          System.out.print((n / i) + " ");
        }
      }
    }
    System.out.println();
  }

  void main() {

    var start = System.currentTimeMillis();
    printDivisorsNaive(12);
    printDivisorsNaive(2000);
    printDivisorsNaive(10000000);
    IO.println("Naive time " + (System.currentTimeMillis() - start) + "ms");

    start = System.currentTimeMillis();
    printDivisorsEfficient(12);
    printDivisorsEfficient(2000);
    printDivisorsNaive(10000000);
    IO.println(System.currentTimeMillis() - start);

    IO.println("Efficient time " + (System.currentTimeMillis() - start) + "ms");
  }

}
