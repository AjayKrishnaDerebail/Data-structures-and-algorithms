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

  void main() {
    IO.println(isPalindromeHeavyRework("A man, a plan, a canal: Panama"));
    IO.println(isPalindromeOptimal("A man, a plan, a canal: Panama"));
  }

}