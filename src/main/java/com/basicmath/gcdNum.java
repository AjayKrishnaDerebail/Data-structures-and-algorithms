package com.basicmath;

public class gcdNum {

  void main() {
    naiveApproach(30,60);
    optimalApproach(30, 60);
  }

  private void naiveApproach(int a, int b) {
    var min = Math.min(a, b); // a < b ? a : b;

    for (var i = min; i >= 1; i--) {
      if (a % i == 0 && b % i == 0) {
        IO.println(i);
        return;
      }
    }
  }

  /**
   * Optimal Approach using Euclid's Algorithm
   * Time Complexity: O(log(min(a, b)))
   * Space Complexity: O(1)
   */
  private void optimalApproach(int x, int y) {

    while(x > 0 && y > 0){
     if (x > y)
       x = x % y;
     else
       y = y % x;
    }

    IO.println(x == 0 ? y : x);

  }

}
