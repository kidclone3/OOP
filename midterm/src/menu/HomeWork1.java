package menu;

import java.lang.reflect.Method;
import java.util.Scanner;

public class HomeWork1 {
  public static void main(String[] args) {
    while (true) {
      System.out.println("1. Exercises on Nested-Loops");
      System.out.println("2. Debugging/Tracing Programs using a Graphic Debugger");
      System.out.println("3. Exercises on String and char Operations");
      System.out.println("0. Exit");
      System.out.println("Choose file to exec: ");
      Scanner scanner = new Scanner(System.in);
      int select = scanner.nextInt();
      scanner.nextLine();
      switch (select) {
        case 1:
          Bai1();
          break;
        case 2:
          Bai2();
          break;
        case 3:
          Bai3();
          break;
        case 0:
          System.out.println("Bye");
          return;

        default:
          System.out.println("Please choose number in [1-3]");
          break;
      }
    }
  }

  static void runMethod(String className) {
    try {
      Class<?> tmp = Class.forName(className);
      Method method = tmp.getDeclaredMethod("main", String[].class);
      method.invoke(null, new Object[] {null});
    } catch (Throwable e) {
      System.err.println(e);
    }
  }

  public static void Bai1() {

    System.out.println("1. SquarePattern");
    System.out.println("2. CheckerPattern");
    System.out.println("3. TimeTable");
    System.out.println("4. TriangularPattern");
    System.out.println("5. BoxPattern");
    System.out.println("6. HillPattern");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "SquarePattern",
      "CheckerPattern",
      "TimeTable",
      "TriangularPattern",
      "BoxPattern",
      "HillPattern"
    };
    runMethod("hw1.bai1." + selection[select - 1]);
  }

  public static void Bai2() {
    System.out.println("1. Factorial");
    //    System.out.println("Choose file to exec: ");
    //    int select = scanner.nextInt(); scanner.nextLine();
    runMethod("hw1.bai2." + "Factorial");
  }

  public static void Bai3() {
    System.out.println("1. ReverseString");
    System.out.println("2. CountVowelsDigits");
    System.out.println("3. PhoneKeyPad");
    System.out.println("4. Caesar’s Code");
    System.out.println("5. Decipher Caesar’s Code");
    System.out.println("6. Exchange Cipher");
    System.out.println("7. TestPalindromicWord and TestPalindromicPhrase");
    System.out.println("8. CheckHexStr");
    System.out.println("9. Bin2Dec");
    System.out.println("10. Hex2Dec");
    System.out.println("11. Oct2Dec");
    System.out.println("12. RadixN2Dec");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "ReverseString",
      "CountVowelsDigits",
      "PhoneKeyPad",
      "CaesarCode",
      "DecipherCaesarCode",
      "ExchangeCipher",
      "TestPalindromic",
      "CheckHexStr",
      "Bin2Dec",
      "Hex2Dec",
      "Oct2Dec",
      "RadixN2Dec",
    };
    runMethod("hw1.bai3." + selection[select - 1]);
  }
}
