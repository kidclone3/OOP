package lab1.bai3;

import java.util.Scanner;

// 3.7
public class AverageWithInputValidation {
  public static void main(String[] args) {
    final int NUM_STUDENTS = 3;
    int numberIn;
    boolean isValid;
    int sum = 0;
    double average;
    Scanner in = new Scanner(System.in);
    for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
      isValid = false;
      do {
        System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
        numberIn = in.nextInt();
        if (0 <= numberIn && numberIn <= 100) {
          isValid = true;
        }
      } while (!isValid);
      sum += numberIn;
    }
    System.out.println("The average is: " + 1.0 * sum / NUM_STUDENTS);
  }
}
