package lab2.bai2;

import java.util.Scanner;

// 2.2
public class HasEight {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int value;
    int sum;
    sum = 0;
    while (true) {
      System.out.print("Enter a positive integer (or -1 to end): ");
      value = in.nextInt();
      if (value == -1) {
        break;
      }
      if (hasEight(value)) {
        sum += value;
      }
    }
    in.close();
    System.out.printf("The magic sum is: %d", sum);
  }

  public static boolean hasEight(int number) {
    while (number > 0) {
      int digit = number % 10;
      if (digit == 8) {
        return true;
      }
      number /= 10;
    }
    return false;
  }
}
