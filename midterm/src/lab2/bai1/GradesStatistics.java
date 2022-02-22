package lab2.bai1;

import java.util.Scanner;

// 1.3
public class GradesStatistics {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int numStudents;
    int[] grades;
    int sumGrade;
    int maximumGrade;
    int minimumGrade;
    sumGrade = 0;
    maximumGrade = -1;
    minimumGrade = 101;
    System.out.print("Enter the number of students: ");
    numStudents = in.nextInt();
    //    Index start at1.
    grades = new int[numStudents + 1];
    if (numStudents > 0) {
      for (int studentNo = 1; studentNo <= numStudents; studentNo++) {
        while (true) {
          System.out.print("Enter the grade for student " + studentNo + ": ");
          grades[studentNo] = in.nextInt();
          if (grades[studentNo] < 0 || grades[studentNo] > 100) {
            System.out.println("Wrong input, please try again!");
          } else {
            sumGrade += grades[studentNo];
            minimumGrade = Math.min(minimumGrade, grades[studentNo]);
            maximumGrade = Math.max(maximumGrade, grades[studentNo]);
            break;
          }
        }
      }
    }
    in.close();
    System.out.printf("The average is: %.2f\n", (1.0 * sumGrade / numStudents));
    System.out.println("The minimum is: " + minimumGrade);
    System.out.println("The maximum is: " + maximumGrade);
  }
}
