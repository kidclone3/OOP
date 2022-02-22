package lab2.bai2;

import java.util.Arrays;
import java.util.Scanner;

// 2.11
public class GradesStatistics2 {
  private static int[] grades;

  public static void main(String[] args) {
    readGrades();
    System.out.print("The grades are: ");
    printArray(grades);
    System.out.printf("The average is: %.2f\n", average(grades));
    System.out.printf("The median is: %.2f\n", median(grades));
    System.out.println("The minimum is: " + min(grades));
    System.out.println("The maximum is: " + max(grades));
    System.out.printf("The standard deviation is: %.2f\n", stdDev(grades));
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

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        System.out.print("[");
      }
      if (i < array.length - 1) {
        System.out.print(array[i] + ", ");
      } else {
        System.out.println(array[i] + "]");
      }
    }
  }

  public static double average(int[] array) {
    double result;
    result = 0;
    for (int element : array) {
      result += 1.0 * element;
    }
    return result / array.length;
  }

  public static double median(int[] array) {
    Arrays.sort(array);
    if (array.length % 2 == 1) {
      return array[array.length / 2];
    } else {
      return (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
    }
  }

  public static int min(int[] array) {
    int result = Integer.MAX_VALUE;
    for (int element : array) {
      if (result > element) {
        result = element;
      }
    }
    return result;
  }

  public static int max(int[] array) {
    int result = Integer.MIN_VALUE;
    for (int element : array) {
      if (result < element) {
        result = element;
      }
    }
    return result;
  }

  public static double stdDev(int[] array) {
    double result;
    result = 0;
    double mean;
    mean = median(array);
    for (int element : array) {
      result += (element - mean) * (element - mean);
    }
    result = Math.sqrt(result / array.length);
    return result;
  }
}
