package com.basicmath;

public class ReverseNum {

  void main() {
    int n = 123;

    var revNum = 0;

    while (n > 0){
      revNum = (n % 10) + revNum * 10;

      n = n / 10;
    }

    IO.println(revNum);
  }

}
