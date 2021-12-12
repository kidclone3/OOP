package hw1.bai1;

import java.util.Scanner;

// 1.1
public class SquarePattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size;
    System.out.print("Enter the size: ");
    size = in.nextInt();
    in.close();

    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        System.out.print("#");
      }
      System.out.println();
    }
    System.out.println();
    try1(size);
  }

  public static void try1(int size) {
    int row, col;
    row = 1;
    while (row <= size) {
      col = 1;
      while (col <= size) {
        System.out.print("#");
        col += 1;
      }
      System.out.println();
      row += 1;
    }
  }
}
