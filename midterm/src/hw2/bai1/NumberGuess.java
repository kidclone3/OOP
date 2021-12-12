package hw2.bai1;

import java.util.Scanner;

// 1.7
public class NumberGuess {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int secretNumber = (int) (Math.random() * 100);
    System.out.println("Key in your guess : ");
    int number = in.nextInt();
    int count = 1;
    while (number != secretNumber) {
      if (number < secretNumber) {
        System.out.println("Try heigher");
        number = in.nextInt();
      }
      if (number > secretNumber) {
        System.out.println("Try lower");
        number = in.nextInt();
      }
      count++;
    }
    System.out.print("You got it in " + count + " trials !");
    in.close();
  }
}
