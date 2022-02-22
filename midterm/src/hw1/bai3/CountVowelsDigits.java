package hw1.bai3;

import java.util.Scanner;

// 3.2
public class CountVowelsDigits {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String inStr = in.nextLine();
//    in.close();

    char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    int countDigits, countVowels;
    countDigits = countVowels = 0;
    for (int i = 0; i < inStr.length(); ++i) {
      char c = inStr.charAt(i);
      if (Character.isDigit(c)) {
        countDigits++;
      } else {
        c = Character.toLowerCase(c);
        for (char vowel : vowels) {
          if (c == vowel) {
            countVowels++;
            break;
          }
        }
      }
    }
    System.out.printf(
        "Number of vowels: %d (%.2f%%)\n", countVowels, 1.0 * countVowels / inStr.length() * 100);
    System.out.printf(
        "Number of digits: %d (%.2f%%)\n", countDigits, 1.0 * countDigits / inStr.length() * 100);
  }
}
