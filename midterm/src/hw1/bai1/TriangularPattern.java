package hw1.bai1;

import java.util.Scanner;

// 1.4
public class TriangularPattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = in.nextInt();
    in.close();

    System.out.println("Type A");
    TriangularPatternA(size);

    System.out.println("Type B");
    TriangularPatternB(size);

    System.out.println("Type C");
    TriangularPatternC(size);

    System.out.println("Type D");
    TriangularPatternD(size);
  }

  public static void TriangularPatternA(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("#");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void TriangularPatternB(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size - row + 1; col++) {
        System.out.print("#");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void TriangularPatternC(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col < row) {
          System.out.print(" ");
        } else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void TriangularPatternD(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col < size - row + 1) {
          System.out.print(" ");
        } else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
  }
}
