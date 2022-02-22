package hw2.bai2;

import java.util.Scanner;

// 2.3
public class LengthNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number :");
    int n = in.nextInt();
//    in.close();
    System.out.println("The length number sequence is : ");
    System.out.print(length(n));
  }

  public static int numOfDigits(int n) {
    int result = 1;
    while (n >= 10) {
      n /= 10;
      result++;
    }
    return result;
  }

  public static int length(int n) {
    if (n == 1) {
      return 1;
    } else {
      return length(n - 1) + numOfDigits(n);
    }
  }
}
