import java.util.Scanner;

public class Bai1 {}
// 1.1
class PrintArray {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int NUM_ITEMS;
    int[] items;
    System.out.print("Enter the number of items: ");
    NUM_ITEMS = in.nextInt();
    items = new int[NUM_ITEMS];

    if (items.length > 0) {
      System.out.print("Enter the value of all items (separated by space): ");
      for (int i = 0; i < NUM_ITEMS; i++) {
        items[i] = in.nextInt();
      }
    }
    in.close();
    System.out.print("The values are: ");
    for (int i = 0; i < items.length; i++) {
      if (i == 0) {
        System.out.print("[");
      }
      if (i < items.length - 1) {
        System.out.print(items[i] + ", ");
      } else {
        System.out.print(items[i] + "]");
      }
    }
  }
}

// 1.2
class PrintArrayInStars {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int NUM_ITEMS;
    int[] items;
    System.out.print("Enter the number of items: ");
    NUM_ITEMS = in.nextInt();
    items = new int[NUM_ITEMS];

    if (items.length > 0) {
      System.out.print("Enter the value of all items (separated by space): ");
      for (int i = 0; i < NUM_ITEMS; i++) {
        items[i] = in.nextInt();
      }
    }
    in.close();
    for (int i = 0; i < items.length; i++) {
      System.out.print(i + ": ");
      for (int starNo = 1; starNo <= items[i]; ++starNo) {
        System.out.print("*");
      }
      System.out.println("(" + items[i] + ")");
    }
  }
}

// 1.3
class GradesStatistics {
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

// 1.4
class Hex2Bin {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final String[] HEX_BITS = {
      "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
      "1011", "1100 ", "1101", "1110", "1111"
    };

    String hexadecimal;

    System.out.print("Enter the Hexadecimal string: ");
    hexadecimal = in.nextLine();
    in.close();
    System.out.print("The equivalent binary for hexadecimal \"" + hexadecimal + "\" is: ");
    for (int i = 0; i < hexadecimal.length(); i++) {
      char inChar = hexadecimal.charAt(i);
      System.out.print(HEX_BITS[convertToDecimal(inChar)] + " ");
    }
  }

  public static int convertToDecimal(char ch) {
    if (Character.isDigit(ch)) {
      return ch - '0';
    } else {
      ch = Character.toLowerCase(ch);
      return ch - 'a' + 10;
    }
  }
}

// 1.5
class Dec2Hex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int decimalNumber;
    System.out.print("Enter a decimal number: ");
    decimalNumber = in.nextInt();
    in.close();
    System.out.println("The equivalent hexadecimal number is " + Integer.toHexString(decimalNumber).toUpperCase());
  }
}
