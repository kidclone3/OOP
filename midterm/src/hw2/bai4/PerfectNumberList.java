package hw2.bai4;

import java.util.Scanner;

// 4.1
public class PerfectNumberList {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the upper bound: ");
    int number = in.nextInt();
//    in.close();
    int countPerfect = 0;
    System.out.println("These numbers are perfect : ");
    for (int idx = 1; idx <= number; idx++)
      if (isPerfect(idx)) {
        System.out.print(idx + " ");
        countPerfect++;
      }
    System.out.println();
    double percentPer = 100.00 * countPerfect / number;
    System.out.printf(" perfect numbers found :%d", countPerfect);
    System.out.printf(" (%.2f", percentPer);
    System.out.println("%)");

    int countDeficient = 0;
    System.out.println("These numbers are neither deficient nor perfect : ");
    for (int idx = 1; idx <= number; idx++)
      if (!isDeficient(idx) && !isPerfect(idx)) {
        System.out.print(idx + " ");
        countDeficient++;
      }
    System.out.println();
    double percentDef = 100.00 * countDeficient / number;
    System.out.printf(" perfect numbers found :%d", countDeficient);
    System.out.printf(" (%.2f", percentDef);
    System.out.println("%)");
  }

  public static boolean isPerfect(int aPosInt) {
    int sum = 0;
    for (int idx = 1; idx <= aPosInt / 2; idx++) if (aPosInt % idx == 0) sum += idx;
    if (sum == aPosInt) {
      return true;
    }
    return false;
  }

  public static boolean isDeficient(int aPosInt) {
    int sum = 0;
    for (int idx = 1; idx <= aPosInt / 2; idx++) if (aPosInt % idx == 0) sum += idx;
    if (sum < aPosInt) return true;
    return false;
  }
}
