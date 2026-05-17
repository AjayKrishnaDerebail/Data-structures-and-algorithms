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

  /**
   * Reverses an array efficiently in-place using a two-pointer swapping strategy. Preferred
   * approach that optimizes performance by operating in O(1) auxiliary space. left == right works
   * for odd length arrays. For even length arrays, it will reverse up to the second last element ,
   * hence we need >= check
   */
  int[] revArrayInPlace(int[] arr, int left, int right) {
    if (left >= right) {
      return arr;
    }

    var temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    return revArrayInPlace(arr, left + 1, right - 1);

  }

  void main() {
    int[] arr = new int[]{1, 2, 3, 4, 5};

    int[] revArr = new int[5];
    revArr = revArrayNonInPlace2Pointer(arr, 0, revArr, arr.length);

    for (int j : revArr) {
      IO.println(j);
    }

    int[] arr2 = new int[]{6, 7, 8, 9, 10};

    int[] revArr2 = revArrayInPlace(arr2, 0, arr2.length - 1);

    for (int j : revArr2) {
      IO.println(j);
    }
  }

}