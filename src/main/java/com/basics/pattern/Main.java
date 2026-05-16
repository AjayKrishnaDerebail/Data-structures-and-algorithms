package com.basics.pattern;

public class Main {

  private static final String LINE_BREAKER = "---------------------------------";
  private static final int n = 5;

  static void main() {
    printPattern1();
    IO.println(LINE_BREAKER);

    printPattern2();
    IO.println(LINE_BREAKER);

    printPattern3();
    IO.println(LINE_BREAKER);

    printPattern4();
    IO.println(LINE_BREAKER);

    printPattern5();
    IO.println(LINE_BREAKER);

    printPattern6();
    IO.println(LINE_BREAKER);

    printPattern7();
    IO.println(LINE_BREAKER);

    printPattern8();
    IO.println(LINE_BREAKER);

    printPattern9();
    IO.println(LINE_BREAKER);

    printPattern10();
  }

  /**
   * Pattern 1 Output:
   * *****
   * *****
   * *****
   * *****
   * *****
   */
  public static void printPattern1() {
    IO.println("Pattern 1");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        IO.print("*");
      }
      IO.println();
    }
  }

  /**
   * Pattern 2 Output:
   * *
   * **
   * ***
   * ****
   * *****
   */
  public static void printPattern2() {
    IO.println("Pattern 2");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        IO.print("*");
      }
      IO.println();
    }
  }

  /**
   * Pattern 3 Output:
   * 1
   * 12
   * 123
   * 1234
   * 12345
   */
  public static void printPattern3() {
    IO.println("Pattern 3");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        IO.print(j);
      }
      IO.println();
    }
  }

  /**
   * Pattern 4 Output:
   * 1
   * 22
   * 333
   * 4444
   * 55555
   */
  public static void printPattern4() {
    IO.println("Pattern 4");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        IO.print(i);
      }
      IO.println();
    }
  }

  /**
   * Pattern 5 Output:
   * *
   * ***
   * *****
   * *******
   * *********
   */
  public static void printPattern5() {
    IO.println("Pattern 5");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        IO.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        IO.print("*");
      }
      for (int j = 0; j < n - i - 1; j++) {
        IO.print(" ");
      }
      IO.println();
    }
  }

  /**
   * Pattern 6 Output:
   * *********
   * *******
   * *****
   * ***
   * *
   */
  public static void printPattern6() {
    IO.println("Pattern 6");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        IO.print(" ");
      }
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        IO.print("*");
      }
      for (int j = 0; j < i; j++) {
        IO.print(" ");
      }
      IO.println();
    }
  }

  /**
   * Pattern 7 Output:
   * *
   * ***
   * *****
   * *******
   * *********
   * *********
   * *******
   * *****
   * ***
   * *
   */
  public static void printPattern7() {
    IO.println("Pattern 7");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        IO.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) {
        IO.print("*");
      }
      for (int j = 0; j < n - i - 1; j++) {
        IO.print(" ");
      }
      IO.println();
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        IO.print(" ");
      }
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        IO.print("*");
      }
      for (int j = 0; j < i; j++) {
        IO.print(" ");
      }
      IO.println();
    }
  }

  /**
   * Pattern 8 Output:
   * *
   * **
   * ***
   * ****
   * *****
   * ****
   * ***
   * **
   * *
   */
  public static void printPattern8() {
    IO.println("Pattern 8");
    for (int i = 1; i <= 2 * n - 1; i++) {
      int condition = (i > n) ? 2 * n - i : i;
      for (int j = 1; j <= condition; j++) {
        IO.print("*");
      }
      IO.println();
    }
  }

  /**
   * Pattern 9 Output:
   * 1
   * 01
   * 101
   * 0101
   * 10101
   */
  public static void printPattern9() {
    IO.println("Pattern 9");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (j == i) {
          IO.print("1");
        } else if (i % 2 == 0) {
          if (j % 2 == 1) {
            IO.print("0");
          } else {
            IO.print("1");
          }
        } else {
          if (j % 2 == 1) {
            IO.print("1");
          } else {
            IO.print("0");
          }
        }
      }
      IO.println();
    }
  }

  /**
   * Pattern 10 Output:
   * 1        1
   * 12      21
   * 123    321
   * 1234  4321
   * 1234554321
   */
  public static void printPattern10() {
    IO.println("Pattern 10");
    int space = (2 * n) - 1;
    for (var i = 0; i <= n; i++) {
      for (var j = 1; j <= i; j++) {
        IO.print(j);
      }
      for (var j = 0; j <= space; j++) {
        IO.print(" ");
      }
      for (var j = i; j >= 1; j--) {
        IO.print(j);
      }
      space -= 2;
      IO.println();
    }
  }

}