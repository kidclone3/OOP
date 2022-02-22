package lab1.bai3;

import java.util.Scanner;

// 3.6
public class InputValidation {
  public static void main(String[] args) {
    int numberIn;

    Scanner in = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a number between 0−10 o r 90−100: ");
      numberIn = in.nextInt();
      if ((0 <= numberIn && numberIn <= 10) || (90 <= numberIn && numberIn <= 100)) {
        System.out.println("You have entered: " + numberIn);
        break;
      } else {
        System.out.println("Invalid input, try again...");
      }
    }
  }
}
