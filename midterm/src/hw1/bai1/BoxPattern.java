package hw1.bai1;

import java.util.Scanner;

// 1.5
public class BoxPattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = in.nextInt();
//    in.close();
    System.out.println("Box A: ");
    BoxPatternA(size);

    System.out.println("Box B: ");
    BoxPatternB(size);

    System.out.println("Box C: ");
    BoxPatternC(size);

    System.out.println("Box D: ");
    BoxPatternD(size);
  }

  public static void BoxPatternA(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        char printingChar = ' ';
        if (row == 1 || row == size || col == 1 || col == size) {
          printingChar = '#';
        }
        System.out.print(printingChar);
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void BoxPatternB(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        char printingChar = ' ';
        if (row == 1 || row == size || row == col) {
          printingChar = '#';
        }
        System.out.print(printingChar);
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void BoxPatternC(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        char printingChar = ' ';
        if (row == 1 || row == size || col == size - row + 1) {
          printingChar = '#';
        }
        System.out.print(printingChar);
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void BoxPatternD(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        char printingChar = ' ';
        if (row == 1 || row == size || col == row || col == size - row + 1) {
          printingChar = '#';
        }
        System.out.print(printingChar);
      }
      System.out.println();
    }
    System.out.println();
  }
}
