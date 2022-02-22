package menu;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Lab1 {
  public static void main(String[] args) {
    System.out.println("1. Getting Started Exercises");
    System.out.println("2. Exercises on Decision and Loop");
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
    System.out.println("1. CheckPassFail");
    System.out.println("2. CheckOddEven");
    System.out.println("3. PrintNumberInWord");
    System.out.println("4. Abstract Superclass Animal");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {"CheckPassFail", "CheckOddEven", "PrintNumberInWord", "PrintDayInWord"};
    runMethod("lab1.bai1." + selection[select - 1]);
  }

  public static void Bai2() {
    System.out.println("1. SumAverageRunningInt");
    System.out.println("2. HarmonicSum");
    System.out.println("3. ComputePI");
    System.out.println("4. Fibonacci");
    System.out.println("5. ExtractDigits");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "SumAverageRunningInt", "HarmonicSum", "ComputePI", "Fibonacci", "ExtractDigits"
    };
    runMethod("lab1.bai2." + selection[select - 1]);
  }

  public static void Bai3() {
    System.out.println("1. SumProductMinMax3");
    System.out.println("2. CircleComputation");
    System.out.println("3. PensionContributionCalculator");
    System.out.println("4. PensionContributionCalculatorWithSentinel");
    System.out.println("5. ReverseInt");
    System.out.println("6. InputValidation");
    System.out.println("7. AverageWithInputValidation");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "SumProductMinMax3",
      "CircleComputation",
      "PensionContributionCalculator",
      "PensionContributionCalculatorWithSentinel",
      "ReverseInt",
      "InputValidation",
      "AverageWithInputValidation"
    };
    runMethod("lab1.bai3." + selection[select - 1]);
  }
}
