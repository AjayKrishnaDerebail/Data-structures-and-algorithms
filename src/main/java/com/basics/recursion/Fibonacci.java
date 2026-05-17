package com.basics.recursion;

import java.util.Arrays;

public class Fibonacci {

  public int nFibBruteForce(int n) {
    if (n <= 1) {
      return n;
    }

    return nFibBruteForce(n - 2) + nFibBruteForce(n - 1);
  }

  public int nFibRecMemo(int n, int[] fib) {
    if (n <= 1) {
      fib[n] = n;
      return n;
    }

    if (fib[n] != -1) {
      return fib[n];
    }

    fib[n] = nFibRecMemo(n - 1, fib) + nFibRecMemo(n - 2, fib);

    return fib[n];
  }

  public void printFibIter1(int n) {
    if (n < 0) {
      return;
    }

    var first = 0;
    var next = 1;
    var cur = 0;
    for (int i = 0; i <= n; i++) {

      IO.print(cur + " ");

      first = next;
      next = cur;

      cur = first + next;
    }
  }

  void main() {

    int n = 10;
    int[] fib = new int[n + 1];
    Arrays.fill(fib, -1);
    IO.println(nFibBruteForce(n));

    IO.println(nFibRecMemo(n, fib));

    for (var i : fib) {
      IO.print(i + " ");
    }

    IO.println();

    printFibIter1(n);

  }

}
