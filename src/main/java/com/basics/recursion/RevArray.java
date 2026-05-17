package com.basics.recursion;

public class RevArray {

  /**
   * Reverses an array non-in-place by copying elements backward into a new array. Avoid due to O(n)
   * auxiliary space complexity and heap allocation overhead.
   */
  int[] revArrayNonInPlace2Pointer(int[] arr, int i, int[] revArr, int size) {

    if (size == 0) {
      return revArr;
    }
    revArr[i] = arr[size - 1];
    return revArrayNonInPlace2Pointer(arr, i + 1, revArr, size - 1);
  }

  void main() {
    int[] arr = new int[]{1, 2, 3, 4, 5};

    int[] revArr = new int[5];
    revArr = revArrayNonInPlace2Pointer(arr, 0, revArr, arr.length);

    for (int j : revArr) {
      IO.println(j);
    }

  }

}