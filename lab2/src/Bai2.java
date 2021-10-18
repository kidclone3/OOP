import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {}
// 2.1
class Exponent {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int exp;
    int base;
    System.out.print("Enter the base: ");
    base = in.nextInt();
    System.out.print("Enter the exponet: ");
    exp = in.nextInt();
    in.close();
    System.out.printf("%d raises to the power %d is: %d\n", base, exp, exponet(base, exp));
  }

  public static int exponet(int base, int exp) {
    int result = 1;
    //      Exponet in O(log(n))
    while (exp > 0) {
      if (exp % 2 == 1) {
        result *= base;
      }
      base = base * base;
      exp /= 2;
    }
    return result;
  }
}

// 2.2
class HasEight {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int value;
    int sum;
    sum = 0;
    while (true) {
      System.out.print("Enter a positive integer (or -1 to end): ");
      value = in.nextInt();
      if (value == -1) {
        break;
      }
      if (hasEight(value)) {
        sum += value;
      }
    }
    in.close();
    System.out.printf("The magic sum is: %d", sum);
  }

  public static boolean hasEight(int number) {
    while (number > 0) {
      int digit = number % 10;
      if (digit == 8) {
        return true;
      }
      number /= 10;
    }
    return false;
  }
}

// 2.3
class Print {
  public static void main(String[] args) {
    //    Array in main just for testing.
    int[] arrayInt = {1, 2, 3, 4, 5, 6};
    double[] arrayDouble = {1.2, 3.4, 5.6, 7.7, 8.0};
    print(arrayInt);
    print(arrayDouble);
  }

  public static void print(double[] array) {
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

  public static void print(int[] array) {
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
}

// 2.4
class ArrayToString {
  public static void main(String[] args) {
    //        Array in main just for testing.
    int[] array = {1, 2, 3, 4, 5, 6};
    String arrayInString = arrayToString(array);
    System.out.println(arrayInString);
  }

  public static String arrayToString(int[] array) {
    String result = "";
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        result += '[';
      }
      if (i < array.length - 1) {
        result += (char) (array[i] + '0');
        result += ", ";
      } else {
        result += (char) (array[i] + '0');
        result += "]";
      }
    }
    return result;
  }
}

// 2.5
class Contains {
  public static void main(String[] args) {
    int[] array1 = {1,2,3,4,5,6};
    int[] array2 = {5,6,7,8,9,10};
    System.out.println(contains(array1, 1));
    System.out.println(contains(array2, 1));
  }
  public static boolean contains(int[] array, int key) {
    for (int element : array) {
        if (element == key) {
          return true;
        }
    }
    return false;
  }
}

// 2.6
class Search {
  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7};
    System.out.println(search(array, 8));
    System.out.println(search(array, 5));
  }
  public static int search(int[] array, int key) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == key) {
        return i;
      }
    }
    return -1;
  }
}

// 2.7
class Equals {
  public static void main(String[] args) {
    int[] array1 = {1,2,3,4,5,6};
    int[] array2 = {1,2,3,4,5,6};
    int[] array3 = {1,2,4,5,6,7};
    System.out.println(equals(array1, array2));
    System.out.println(equals(array1, array3));
    System.out.println(equals(array2, array3));

  }
  public static boolean equals(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] != array2[i]) {
        return false;
      }
    }
    return true;
  }
}

// 2.8
class CopyOf {
  public static void main(String[] args) {
    int[] array1 = {1,2,3,4,5,6,7};
    int[] array2 = copyOf(array1);
    for (int element : array2) {
      System.out.print(element + " ");
    }
  }
  public static int[] copyOf(int[] array) {
    int[] result;
    result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }
}

// 2.9
class Swap {
  public static void main(String[] args) {
    int[] array1 = {1,2,3,4,5,6};
    int[] array2 = {4,5,6,7,8,9};
    System.out.println(swap(array1, array2));
  }
  public static boolean swap(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0; i < array1.length; i++) {
      int temp;
      temp = array1[i];
      array1[i] = array2[i];
      array2[i] = temp;
    }
    return true;
  }
}

// 2.10
class Reverse {
  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7};
    reverse(array);
    for (int element : array) {
      System.out.print(element + " ");
    }
  }
  public static void reverse(int[] array) {
    for(int fIdx = 0, bIdx = array.length-1; fIdx < bIdx; ++fIdx, --bIdx) {
      int temp;
      temp = array[fIdx];
      array[fIdx] = array[bIdx];
      array[bIdx] = temp;
    }
  }
}

// 2.11
class GradesStatistics2 {
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
      return array[array.length/2];
    } else {
      return (array[array.length/2 - 1] + array[array.length/2])/2;
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
    result = Math.sqrt(result/array.length);
    return result;
  }
}

// 2.12
class GradesHistogram {
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
        result[9] ++;
      }
      else {
        result[element / 10] ++;
      }
    }
    return result;
  }
  public static void displayHorizontal() {
    for (int i = 0; i < groupGrades.length; i++) {
      int start;
      int end;
      start = 10 * i;
      end = 10 * (i+1) - 1;
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
    final String[] titles = {" 0− 9", "10−19", "20−29", "30−39", "40−49", "50−59", "60−69", "70−79", "80−89", "90−100"};
    int maxStar = -1;
    for (int element: groupGrades) {
        if (maxStar < element) {
          maxStar = element;
        }
    }
    for(int star = maxStar; star >= 1; --star) {
      String row = "";
      for (int i = 0; i < groupGrades.length; ++i) {
        if (groupGrades[i] >= star) {
          row += "   *   ";
        }
        else {
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