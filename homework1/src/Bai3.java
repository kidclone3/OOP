import java.util.Scanner;

public class Bai3 {
}
// 3.1
class ReverseString {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String inStr = in.nextLine();
    String inStrReverse = new StringBuilder(inStr).reverse().toString();
    System.out.println(inStrReverse);
  }
}

// 3.2
class CountVowelsDigits {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String inStr = in.nextLine();
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    int countDigits, countVowels;
    countDigits = countVowels = 0;
    for (int i = 0; i < inStr.length(); ++i) {
      char c = inStr.charAt(i);
      if (Character.isDigit(c)) {
        countDigits ++;
      }
      else {
        c = Character.toLowerCase(c);
        for (char vowel : vowels) {
          if (c == vowel) {
            countVowels++;
            break;
          }
        }
      }
    }
    System.out.printf("Number of vowels: %d (%.2f%%)\n", countVowels, 1.0 * countVowels / inStr.length() * 100);
    System.out.printf("Number of digits: %d (%.2f%%)\n", countDigits, 1.0 * countDigits / inStr.length() * 100);
  }
}

// 3.3
class PhoneKeyPad {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String inStr = in.next().toLowerCase();
    PhoneKeyPadIfElse(inStr);
    PhoneKeyPadSwitchCase(inStr);
  }
  public static void PhoneKeyPadIfElse(String inStr) {
    for (int i = 0; i < inStr.length(); ++i) {
      char c = inStr.charAt(i);
      if (c == 'a' || c == 'b' || c == 'c') System.out.print(2);
      if (c == 'd' || c == 'e' || c == 'f') System.out.print(3);
      if (c == 'g' || c == 'h' || c == 'i') System.out.print(4);
      if (c == 'j' || c == 'k' || c == 'l') System.out.print(5);
      if (c == 'm' || c == 'n' || c == 'o') System.out.print(6);
      if (c == 'p' || c == 'q' || c == 'r' || c == 's') System.out.print(7);
      if (c == 't' || c == 'u' || c == 'v') System.out.print(8);
      if (c == 'w' || c == 'x' || c == 'y' || c == 'z') System.out.print(9);
    }
    System.out.println();
  }
  public static void PhoneKeyPadSwitchCase(String inStr) {
    for (int i = 0; i < inStr.length(); ++i) {
      char c = inStr.charAt(i);
      switch (c) {
        case 'a':
        case 'b':
        case 'c':
          System.out.print(2);
          break;
        case 'd':
        case 'e':
        case 'f':
          System.out.print(3);
          break;
        case 'g':
        case 'h':
        case 'i':
          System.out.print(4);
          break;
        case 'j':
        case 'k':
        case 'l':
          System.out.print(5);
          break;
        case 'm':
        case 'n':
        case 'o':
          System.out.print(6);
          break;
        case 'p':
        case 'q':
        case 'r':
        case 's':
          System.out.print(7);
          break;
        case 't':
        case 'u':
        case 'v':
          System.out.print(8);
          break;
        case 'w':
        case 'x':
        case 'y':
        case 'z':
          System.out.print(9);
          break;
      }
    }
    System.out.println();
  }
}

// 3.4
class CaesarCode {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a plaintext string: ");
    String inStr = in.nextLine().toUpperCase();

    int n = 3;
    String ciphertext = "";
    for (int i = 0; i < inStr.length(); i++) {
      char inChar = inStr.charAt(i);
      int cipher = (inChar - 'A' + n) % 26 + 'A';
      ciphertext = ciphertext + (char) cipher;
    }
    System.out.println("The ciphertext string is: " + ciphertext);
  }
}

// 3.5
class DecipherCaesarCode {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a ciphertext string: ");
    String inStr = in.nextLine().toUpperCase();

    int n = 3;
    String ciphertext = "";
    for (int i = 0; i < inStr.length(); i++) {
      char inChar = inStr.charAt(i);
      int cipher = (inChar - 'A' - n + 26) % 26 + 'A';
      ciphertext = ciphertext + (char) cipher;
    }
    System.out.println("The ciphertext string is: " + ciphertext);
  }
}

// 3.6
class ExchangeCipher {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a ciphertext string: ");
    String inStr = in.nextLine().toUpperCase();

    String ciphertext = "";
    for (int i = 0; i < inStr.length(); i++) {
      char inChar = inStr.charAt(i);
      int cipher = (25 - inChar + 'A') + 'A';
      ciphertext = ciphertext + (char) cipher;
    }
    System.out.println("The ciphertext string is: " + ciphertext);
  }
}

// 3.7
class TestPalindromic {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the word: ");
    String word = in.nextLine().toLowerCase();
    System.out.println("This text is " + (TestPalindromicWord(word) ? "palindromic" : "not palindromic"));
    System.out.println();

    System.out.println("Enter the phrase:");
    String phrase = in.nextLine().toLowerCase();
    System.out.println("This phrase is " + (TestPalindromicPhrase(phrase) ? "palindromic" : "not palindromic"));
  }
  public static boolean TestPalindromicWord(String inStr) {
    for (int i = 0; i < inStr.length()/2; ++i) {
      if (inStr.charAt(i) != inStr.charAt(inStr.length()-i-1)) {
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

// 3.8
