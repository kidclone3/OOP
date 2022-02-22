package hw1.bai3;

import java.util.Scanner;

// 3.1
public class ReverseString {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String inStr = in.nextLine();
//    in.close();

    String inStrReverse = new StringBuilder(inStr).reverse().toString();
    System.out.println(inStrReverse);
  }
}
