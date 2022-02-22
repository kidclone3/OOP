package lab2.bai2;

import java.util.Scanner;

// 2.1
public class Exponent {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int exp;
    int base;
    System.out.print("Enter the base: ");
    base = in.nextInt();
    System.out.print("Enter the exponet: ");
    exp = in.nextInt();
    in.close();
    System.out.printf("%d raises to the power %d is: %d\n", base, exp, exponet(base, exp));
  }

  public static int exponet(int base, int exp) {
    int result = 1;
    //      Exponet in O(log(n))
    while (exp > 0) {
      if (exp % 2 == 1) {
        result *= base;
      }
      base = base * base;
      exp /= 2;
    }
    return result;
  }
}
