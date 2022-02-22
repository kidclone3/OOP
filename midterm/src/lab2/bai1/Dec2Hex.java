package lab2.bai1;

import java.util.Scanner;

// 1.5
public class Dec2Hex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int decimalNumber;
    System.out.print("Enter a decimal number: ");
    decimalNumber = in.nextInt();
    in.close();
    System.out.println(
        "The equivalent hexadecimal number is " + Integer.toHexString(decimalNumber).toUpperCase());
  }
}
