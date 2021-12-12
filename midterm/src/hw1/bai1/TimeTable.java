package hw1.bai1;

import java.util.Scanner;

// 1.3
public class TimeTable {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size;
    System.out.print("Enter the size: ");
    size = in.nextInt();
    in.close();

    for (int col = 1; col <= size; ++col) {
      if (col == 1) {
        System.out.printf("%2c |", '*');
      }
      System.out.printf("%4d", col);
    }
    System.out.println();
    for (int seperator = 1; seperator <= 4 * size + 4; ++seperator) {
      System.out.print("-");
    }
    System.out.println();
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col == 1) {
          System.out.printf("%2d |", row);
        }
        System.out.printf("%4d", row * col);
      }
      System.out.println();
    }
  }
}
