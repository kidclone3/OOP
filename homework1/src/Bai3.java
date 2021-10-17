import java.util.Scanner;

public class Bai3 {
}
// 3.1
class ReverseString {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String inStr = in.nextLine();
    in.close();

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
    in.close();

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
    in.close();

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
    in.close();
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
    in.close();
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
    in.close();
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
    in.close();
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
class CheckHexStr {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a hex string: ");
    String inStr = in.nextLine();
    in.close();

    System.out.println(inStr + " is " + (CheckHexStr(inStr) ? "" : "NOT") + " a hex string");
  }
  public static boolean CheckHexStr(String inStr) {
    for (int i  = 0; i < inStr.length(); ++i) {
      char inChar = inStr.charAt(i);
      if (!Character.isDigit(inChar)) {
        inChar = Character.toLowerCase(inChar);
        if (!Character.isLetter(inChar) || inChar > 'f') {
          return false;
        }
      }
    }
    return true;
  }
}

// 3.8
class Bin2Dec {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Binary string: ");
    String inStr = in.nextLine().toLowerCase();
    in.close();
    int answer = 0;
    System.out.println("The equivalent decimal number for binary \"" + inStr + "\" is: " + bin2Dec(inStr));
  }
  public static int bin2Dec(String inStr) throws IllegalArgumentException{
    int result = 0;
    String binary = new StringBuilder(inStr).reverse().toString();
    for(int i = 0; i < binary.length(); ++i) {
      char inChar = binary.charAt(i);
      if (!Character.isDigit(inChar) || inChar > '1') {
        IllegalArgumentException notBinary = new IllegalArgumentException("error: invalid binary string \"" + inStr + "\"");
        throw notBinary;
      } else if (inChar == '1') {
        result += 1 << i;
      }
    }
    return result;
  }
}

// 3.9
class Hex2Dec {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a Hexadecimal string: ");
    String inStr = in.nextLine();
    in.close();
    System.out.println("The equivalent decimal number for hexadecimal \"" + inStr + "\" is: " + hex2Dec(inStr));
  }
  public static int hex2Dec(String inStr) throws IllegalArgumentException{
    String hexadecimal = new StringBuilder(inStr.toLowerCase()).reverse().toString();
    int result = 0;

    for (int i = 0; i < hexadecimal.length(); i++) {
      char inChar = hexadecimal.charAt(i);
      if (Character.isDigit(inChar)) {
        result += (int) (inChar - '0') * Math.pow(16, i);
      } else if (inChar <= 'f') {
        result += (int) (inChar - 'a' + 10) * Math.pow(16, i);
      } else {
        IllegalArgumentException notHexa = new IllegalArgumentException("error: invalid hexadecimal string \"" + inStr + "\"");
        throw notHexa;
      }
    }
    return result;
  }
}

// 3.11
class Oct2Dec {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a Octal string: ");
    String inStr = in.nextLine();
    in.close();
    System.out.println("The equivalent decimal number for octal \"" + inStr + "\" is: " + oct2Dec(inStr));
  }
  public static int oct2Dec(String inStr) throws IllegalArgumentException{
    String octal = new StringBuilder(inStr.toLowerCase()).reverse().toString();
    int result = 0;
    for (int i = 0; i < octal.length(); i++) {
      char inChar = octal.charAt(i);
      if (Character.isDigit(inChar) && inChar < '8') {
        result += (int) (inChar - '0') * Math.pow(8, i);
      } else {
        IllegalArgumentException notOctal = new IllegalArgumentException("error: invalid octal string \"" + inStr + "\"");
        throw notOctal;
      }
    }
    return result;
  }
}

class RadixN2Dec {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int radix;
    String inStr;

    System.out.print("Enter the radix: ");
    radix = in.nextInt();
    in.nextLine();
    if (radix > 16) {
      System.out.println("Wrong radix (must less or equal 16)");
      return;
    }

    System.out.print("Enter a string: ");
    inStr = in.nextLine();
    in.close();
    System.out.println("The equivalent decimal number \"" + inStr + "\" is: " + radixN2Dec(radix, inStr));
  }
  public static int radixN2Dec(int radix, String inStr) throws IllegalArgumentException{
    int result = 0;
    String text = new StringBuilder(inStr.toLowerCase()).reverse().toString();
    for (int i = 0; i < text.length(); i++) {
      char inChar = text.charAt(i);
      int digit = convert2Dec(radix, inChar);
      if (digit == -1) {
        IllegalArgumentException wrongBase = new IllegalArgumentException("\"error: invalid radix " + radix +" string \" + inStr + \"");
        throw wrongBase;
      }
      else {
        result += (int) digit * Math.pow(radix, i);
      }
    }
    return result;
  }
  public static int convert2Dec(int radix, char inChar) {
    int digit;
    if (Character.isDigit(inChar)) {
      digit = inChar - '0';
    } else {
      digit = inChar - 'a' + 10;
    }
    return digit < radix ? digit : -1;
  }
}