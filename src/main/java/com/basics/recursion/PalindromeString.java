package com.basics.recursion;

public class PalindromeString {

  public boolean isPalindromeHeavyRework(String text) {
    if (text.length() <= 1) {
      return true;
    }

    text = text.toLowerCase();
    text = text.replaceAll("[^a-z0-9]", "");

    char[] textArray = text.toCharArray();

    for (int i = 0; i < text.length(); i++) {
      var left = textArray[i];
      var right = textArray[text.length() - i - 1];
      if (left != right) {
        return false;
      }
    }

    return true;
  }

  public boolean isPalindromeOptimal(String s) {
    if (s == null || s.length() <= 1) {
      return true;
    }

    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      }
      while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      }
      if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }

  public boolean isPalindromeRecursion(String s, int left ,int right) {
    if (s == null || s.length() <= 1) {
      return true;
    }

    if(left >= right)
      return true;

    if(!Character.isLetterOrDigit(s.charAt(left)))
      return isPalindromeRecursion(s , left + 1 , right);

    if(!Character.isLetterOrDigit(s.charAt(right)))
      return isPalindromeRecursion(s , left , right - 1);

    if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
      return isPalindromeRecursion(s, left + 1, right - 1);
    }

    return false;
  }

  void main() {
    final var s = "A man, a plan, a canal: Panama";
    final var r = "!AmannamA";
    final var t = "!AmanamA";
    final var u = "!AanamA";
    IO.println(isPalindromeHeavyRework(s));
    IO.println(isPalindromeOptimal(s));
    IO.println(isPalindromeRecursion(s, 0, s.length() - 1));
    IO.println(isPalindromeRecursion(r, 0, r.length() - 1));
    IO.println(isPalindromeRecursion(t, 0, t.length() - 1));
    IO.println(isPalindromeRecursion(u, 0, u.length() - 1));
  }

}