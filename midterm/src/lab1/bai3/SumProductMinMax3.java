package lab1.bai3;

import java.util.Scanner;

// 3.1
public class SumProductMinMax3 {
  public static void main(String[] args) {
    //    SumProductMinMax3();
    SumProductMinMax5();
  }

  public static void SumProductMinMax3() {
    int number1, number2, number3;
    int sum, product, min, max;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter 1st integer: ");
    number1 = in.nextInt();
    System.out.println("Enter 2nd integer: ");
    number2 = in.nextInt();
    System.out.println("Enter 3rd integer: ");
    number3 = in.nextInt();
    in.close();
    sum = number1 + number2 + number3;
    product = number1 * number2 * number3;

    min = number1;
    if (number2 < min) {
      min = number2;
    }
    if (number3 < min) {
      min = number3;
    }
    max = number1;
    if (number2 > min) {
      max = number2;
    }
    if (number3 > min) {
      max = number3;
    }
    System.out.println("Sum = " + sum + ", Product = " + product);
    System.out.println("Min = " + min + ", Max = " + max);
    System.out.println();
  }

  //  Try 1.
  public static void SumProductMinMax5() {
    int number1, number2, number3, number4, number5;
    int sum, product, min, max;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter 1st integer: ");
    number1 = in.nextInt();
    System.out.println("Enter 2nd integer: ");
    number2 = in.nextInt();
    System.out.println("Enter 3rd integer: ");
    number3 = in.nextInt();
    System.out.println("Enter 4th integer: ");
    number4 = in.nextInt();
    System.out.println("Enter 5th integer: ");
    number5 = in.nextInt();

    in.close();

    sum = number1 + number2 + number3 + number4 + number5;
    product = number1 * number2 * number3 * number4 * number5;

    min = number1;
    if (number2 < min) {
      min = number2;
    }
    if (number3 < min) {
      min = number3;
    }
    if (number4 < min) {
      min = number4;
    }
    if (number5 < min) {
      min = number5;
    }

    max = number1;
    if (number2 > min) {
      max = number2;
    }
    if (number3 > min) {
      max = number3;
    }
    if (number4 > min) {
      max = number4;
    }
    if (number5 > min) {
      max = number5;
    }

    System.out.println("Sum = " + sum + ", Product = " + product);
    System.out.println("Min = " + min + ", Max = " + max);
  }
}
