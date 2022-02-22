package lab2.bai2;

import java.util.Scanner;

// 2.12
public class GradesHistogram {
  private static int[] grades;
  private static int[] groupGrades;

  public static void main(String[] args) {
    readGrades();
    groupGrades = group();
    System.out.println("Horizontal");
    displayHorizontal();
    System.out.println();
    System.out.println("Vertical");
    displayVertical();
  }

  public static void readGrades() {
    Scanner in = new Scanner(System.in);
    final int numStudents;

    System.out.print("Enter the number of students: ");
    numStudents = in.nextInt();
    //    Index start at1.
    grades = new int[numStudents];
    if (numStudents > 0) {
      for (int studentNo = 0; studentNo < numStudents; studentNo++) {
        while (true) {
          System.out.print("Enter the grade for student " + (studentNo + 1) + ": ");
          grades[studentNo] = in.nextInt();
          if (grades[studentNo] < 0 || grades[studentNo] > 100) {
            System.out.println("Wrong input, please try again!");
          } else {
            break;
          }
        }
      }
    }
    in.close();
  }

  public static int[] group() {
    //    group all grades to an 10-length-array;
    int[] result;
    result = new int[10];
    for (int element : grades) {
      if (element == 100) {
        result[9]++;
      } else {
        result[element / 10]++;
      }
    }
    return result;
  }

  public static void displayHorizontal() {
    for (int i = 0; i < groupGrades.length; i++) {
      int start;
      int end;
      start = 10 * i;
      end = 10 * (i + 1) - 1;
      if (i == 9) {
        end = 100;
      }
      System.out.printf("%2d - %2d: ", start, end);
      for (int starNo = 0; starNo < groupGrades[i]; starNo++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void displayVertical() {
    final String[] titles = {
      " 0− 9", "10−19", "20−29", "30−39", "40−49", "50−59", "60−69", "70−79", "80−89", "90−100"
    };
    int maxStar = -1;
    for (int element : groupGrades) {
      if (maxStar < element) {
        maxStar = element;
      }
    }
    for (int star = maxStar; star >= 1; --star) {
      String row = "";
      for (int i = 0; i < groupGrades.length; ++i) {
        if (groupGrades[i] >= star) {
          row += "   *   ";
        } else {
          row += "       ";
        }
      }
      System.out.println(row);
    }
    for (String row : titles) {
      System.out.print(" " + row + " ");
    }
  }
}
