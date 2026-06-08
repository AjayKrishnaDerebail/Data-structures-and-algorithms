package com.arrays;

public class FindLargest {

  void main() {
    int[] arr = {5, 1, 3, 0, 10, 20, 33, 8, 4};
    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;

    int smallest = arr[0];
    int secondSmallest = Integer.MAX_VALUE;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        // Shift current largest down to second
        secondLargest = largest;
        largest = arr[i];
      }
      // Check if the current number is between second and first
      else if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }
    }

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < largest) {
        // Shift current largest down to second
        secondSmallest = smallest;
        smallest = arr[i];
      }
      // Check if the current number is between second and first
      else if (arr[i] < secondSmallest && arr[i] != smallest) {
        secondSmallest = arr[i];
      }
    }


    IO.println(largest);
    IO.println(secondLargest);

    IO.println(smallest);
    IO.println(secondSmallest);
  }

}
