package lab1.bai3;

import java.util.Scanner;

// 3.5
public class ReverseInt {
  public static void main(String[] args) {
    int inNumber, inDigit;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a possitive integer: ");
    inNumber = in.nextInt();
    System.out.print("The reverse is: ");
    while (inNumber > 0) {
      inDigit = inNumber % 10;
      System.out.print(inDigit);
      inNumber /= 10;
    }
    System.out.println();
  }
}
