package hw1.bai3;

import java.util.Scanner;

// 3.7
public class TestPalindromic {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the word: ");
    String word = in.nextLine().toLowerCase();
    System.out.println(
        "This text is " + (TestPalindromicWord(word) ? "palindromic" : "not palindromic"));
    System.out.println();

    System.out.println("Enter the phrase:");
    String phrase = in.nextLine().toLowerCase();
    System.out.println(
        "This phrase is " + (TestPalindromicPhrase(phrase) ? "palindromic" : "not palindromic"));
    in.close();
  }

  public static boolean TestPalindromicWord(String inStr) {
    for (int i = 0; i < inStr.length() / 2; ++i) {
      if (inStr.charAt(i) != inStr.charAt(inStr.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static boolean TestPalindromicPhrase(String inStr) {
    int fIdx, bIdx, strLen;
    strLen = inStr.length();
    fIdx = 0;
    bIdx = strLen - 1;
    while (fIdx < bIdx) {
      if (!Character.isLetter(inStr.charAt(fIdx))) {
        fIdx++;
        continue;
      }
      if (!Character.isLetter(inStr.charAt(bIdx))) {
        bIdx--;
        continue;
      }
      if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
        return false;
      }
      fIdx++;
      bIdx--;
    }
    return true;
  }
}
