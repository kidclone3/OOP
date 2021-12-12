package hw1.bai1;

import java.util.Scanner;

// 1.6
public class HillPattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the rows: ");
    int numberRows = in.nextInt();
    in.close();

    System.out.println("Hill A");
    HillPatternA(numberRows);

    System.out.println("Hill B");
    HillPatternB(numberRows);

    System.out.println("Hill C");
    HillPatternC(numberRows);

    System.out.println("Hill D");
    HillPatternD(numberRows);
  }

  public static void HillPatternA(int numberRows) {
    for (int row = 1; row <= numberRows; row++) {
      String pattern = "#";
      pattern = pattern.repeat(2 * row - 1);
      String space = " ";
      space = space.repeat(numberRows - row);
      System.out.println(space + pattern + space);
    }
    System.out.println();
  }

  public static void HillPatternB(int numberRows) {
    for (int row = numberRows; row > 0; row--) {
      String pattern = "#";
      pattern = pattern.repeat(2 * row - 1);
      String space = " ";
      space = space.repeat(numberRows - row);
      System.out.println(space + pattern + space);
    }
    System.out.println();
  }

  public static void HillPatternC(int numberRows) {
    //    Upper part
    for (int row = 1; row <= numberRows; row++) {
      String pattern = "#";
      pattern = pattern.repeat(2 * row - 1);
      String space = " ";
      space = space.repeat(numberRows - row);
      System.out.println(space + pattern + space);
    }
    //    Lower part
    for (int row = numberRows - 1; row > 0; row--) {
      String pattern = "#";
      pattern = pattern.repeat(2 * row - 1);
      String space = " ";
      space = space.repeat(numberRows - row);
      System.out.println(space + pattern + space);
    }
    System.out.println();
  }

  public static void HillPatternD(int numberRows) {
    //    Upper part
    for (int row = 0; row <= numberRows - 1; row++) {
      String space = " ", pattern = "#";
      if (row == 0) {
        pattern = pattern.repeat(2 * numberRows - 1);
        System.out.println(pattern);
      } else {
        space = space.repeat(2 * row - 1);
        pattern = pattern.repeat(numberRows - row);
        System.out.println(pattern + space + pattern);
      }
    }
    //    Lower part
    for (int row = numberRows - 2; row >= 0; row--) {
      String space = " ", pattern = "#";
      if (row == 0) {
        pattern = pattern.repeat(2 * numberRows - 1);
        System.out.println(pattern);
      } else {
        space = space.repeat(2 * row - 1);
        pattern = pattern.repeat(numberRows - row);
        System.out.println(pattern + space + pattern);
      }
    }
    System.out.println();
  }
}
