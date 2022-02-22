package menu;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Lab2 {
  public static void main(String[] args) {
    System.out.println("1. Exercises on Array");
    System.out.println("2. Exercises on Method");
    System.out.println("3. Exercises on Input, Decision and Loop");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    switch (select) {
      case 1:
        Bai1();
        break;
      case 2:
        Bai1();
        break;
      case 3:
        Bai1();
        break;
      case 0:
        System.out.println("Bye");
        return;
      default:
        System.out.println("Please choose number in [1-1]");
        break;
    }
  }

  static Scanner scanner = new Scanner(System.in);

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
    System.out.println("1. PrintArray");
    System.out.println("2. PrintArrayInStars");
    System.out.println("3. GradesStatistics");
    System.out.println("4. Hex2Bin");
    System.out.println("5. Dec2Hex");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "PrintArray", "PrintArrayInStars", "GradesStatistics", "Hex2Bin", "Dec2Hex"
    };
    runMethod("lab2.bai1." + selection[select - 1]);
  }

  public static void Bai2() {
    System.out.println("1. Exponent");
    System.out.println("2. HasEight");
    System.out.println("3. Print");
    System.out.println("4. ArrayToString");
    System.out.println("5. Contains");
    System.out.println("6. Search");
    System.out.println("7. Equals");
    System.out.println("8. CopyOf");
    System.out.println("9. Swap");
    System.out.println("10. Reverse");
    System.out.println("11. GradesStatistics");
    System.out.println("12. GradesHistogram");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "Exponent",
      "HasEight",
      "Print",
      "ArrayToString",
      "Contains",
      "Search",
      "Equals",
      "CopyOf",
      "Swap",
      "Reverse",
      "GradesStatistics2",
      "GradesHistogram"
    };
    runMethod("lab2.bai2." + selection[select - 1]);
  }
}
