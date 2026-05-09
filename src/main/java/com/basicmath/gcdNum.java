package com.basicmath;

public class gcdNum {

  void main() {
    naiveApproach(30,60);
    optimalApproach(30,55);
  }

  private void naiveApproach(int a, int b) {
    var min = Math.min(a, b); // a < b ? a : b;

    for(var i = min; i >=1 ; i--){
      if(a % i == 0 && b % i == 0){
        IO.println(i);
        return;
      }
    }
  }

  private void optimalApproach(int a, int b) {

  }

}
