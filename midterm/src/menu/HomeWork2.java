package menu;

import static menu.RunMethod.runMethod;

public class HomeWork2 implements iScanner{
  public static void main(String[] args) {
    System.out.println("1. More Exercises");
    System.out.println("2. Exercises on Recursion");
    System.out.println("3. Exercises on Algorithms - Sorting and Searching");
    System.out.println("4. Exercises on Algorithms - Number Theory");
    System.out.println("Choose file to exec: ");
    int select = 0;
    select = scanner.nextInt();
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
      case 4:
        Bai4();
        break;
      case 0:
        System.out.println("Bye");
        return;

      default:
        System.out.println("Please choose number in [1-4]");
        break;
    }
  }

  public static void Bai1() {

    System.out.println("1. Matrices (2D Arrays)");
    System.out.println("2. Trigonometric Series");
    System.out.println("3. Exponential Series");
    System.out.println("4. FactorialInt (Handling Overflow)");
    System.out.println("5. FibonacciInt (Handling Overflow)");
    System.out.println("6. Number System Conversion");
    System.out.println("7. NumberGuess");
    System.out.println("8. WordGuess");
    System.out.println("9. DateUtil");
    System.out.println("Choose file to exec: ");
    int select = 0;
    select = scanner.nextInt();
    String[] selection = {
      "Matrices",
      "TrigonometricSeries",
      "SpecialSeries",
      "FactorialInt",
      "FibonacciInt",
      "NumberConversion",
      "NumberGuess",
      "WordGuess",
      "DateUtil"
    };
    runMethod("hw2.bai1." + selection[select - 1]);
  }

  public static void Bai2() {
    System.out.println("1. Factorial Recusive");
    System.out.println("2. Fibonacci (Recursive)");
    System.out.println("3. Length of a Running Number Sequence (Recursive)");
    System.out.println("4. GCD (Recursive)");
    System.out.println("Choose file to exec: ");
    int select = 0;
    select = scanner.nextInt();
    String[] selection = {"Factorial", "Fibonacci", "LengthNumber", "GCD"};
    runMethod("hw2.bai2." + selection[select - 1]);
  }

  public static void Bai3() {
    System.out.println("1. Linear Search");
    System.out.println("2. Recursive Binary Search");
    System.out.println("3. Bubble Sort");
    System.out.println("4. Selection Sort");
    System.out.println("5. Insertion Sort");
    System.out.println("Choose file to exec: ");
    int select = 0;
    select = scanner.nextInt();
    String[] selection = {
      "LinearSearch", "RecursiveBinarySearch", "BubbleSort", "SelectionSort", "InsertionSort"
    };
    runMethod("hw2.bai3." + selection[select - 1]);
  }

  public static void Bai4() {
    System.out.println("1. Perfect and Deficient Numbers");
    System.out.println("2. Prime Numbers");
    System.out.println("3. Prime Factors");
    System.out.println("4. Greatest Common Divisor (GCD)");

    System.out.println("Choose file to exec: ");
    int select = 0;
    select = scanner.nextInt();
    String[] selection = {"PerfectNumberList", "PrimeList", "PerfectPrimeFactorList", "Gcd"};

    runMethod("hw2.bai4." + selection[select - 1]);
  }
}
