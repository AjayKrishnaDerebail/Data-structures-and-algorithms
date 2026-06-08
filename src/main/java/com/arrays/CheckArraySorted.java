package com.arrays;

public class CheckArraySorted {

  void main() {
    int[] arr = {1, 2, 3, 4, 5};
    int[] arr2 = {1, 4, 2, 10, 9, 5};
    int[] arr3 = {10};
    int[] arr4 = {};

    checkArraySorted(arr);
    checkArraySorted(arr2);
    checkArraySorted(arr3);
    checkArraySorted(arr4);

  }

  void checkArraySorted(int[] arr) {

    if (arr.length <= 1) {
      IO.println("Array is sorted");
      return;
    }

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        IO.println("Array is not sorted");
        return;
      }
    }
    IO.println("Array is sorted");
  }

}