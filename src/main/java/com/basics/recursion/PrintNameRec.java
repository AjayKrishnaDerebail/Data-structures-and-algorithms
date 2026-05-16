package com.basics.recursion;

public class PrintNameRec {

  int times = 100;

  public void printName(){
    if(times == 0) {
      IO.println("Hit base condition");
      return;
    }
    IO.println(times + " Eren Jaegar");
    times--;
    printName();
  }

  void main() {
    printName();
  }
}