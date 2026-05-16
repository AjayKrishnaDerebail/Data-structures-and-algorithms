package com.basics.basicmath;

import java.util.Scanner;

public class ArmStrongNumber {

  void main() {
    var t = 3;
    while (t > 0) {
      checkArmstrong(new Scanner(System.in).nextInt());
      t = t - 1;
    }
  }
  public void checkArmstrong(int n) {
    if (n < 0) return;

    if(n == Integer.MAX_VALUE)
      return;

    int count = 0;
    int temp = n;
    while (temp > 0) {
      temp /= 10;
      count++;
    }

    if(count == 1) {
      IO.println(n + " is ArmStrong number");
      return;
    }

    long[] digitPowers = new long[10];
    for (int i = 0; i < 10; i++) {
      long p = 1;
      for (int j = 0; j < count; j++) {
        p *= i;
      }
      digitPowers[i] = p;
    }

    long sum = 0;
    temp = n;
    while (temp > 0) {
      sum += digitPowers[temp % 10];
      temp /= 10;

      if (sum > n) break;
    }

    if (sum == n)
      System.out.println("Armstrong");
    else
      System.out.println("Not Armstrong");

  }

}