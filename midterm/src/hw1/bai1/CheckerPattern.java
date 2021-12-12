package hw1.bai1;

import java.util.Scanner;

// 1.2
public class CheckerPattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size;
    System.out.print("Enter the size: ");
    size = in.nextInt();
    in.close();

    for (int row = 1; row <= size; row++) {
      if (row % 2 == 0) {
        System.out.print(" ");
      }
      for (int col = 1; col <= size; col++) {
        System.out.print("# ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
