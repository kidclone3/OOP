package hw2.bai2;

import java.util.Scanner;

// 2.1
public class Factorial {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter any number : ");
    int n = in.nextInt();
    in.close();
    System.out.print(factorial(n));
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return factorial(n - 1) * n;
    }
  }
}
