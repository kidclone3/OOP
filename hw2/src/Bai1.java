import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Bai1 {}

// 1.1
class Matrices {
  public static void main(String[] args) {
    int[][] fibo = {{1, 1}, {1, 0}};
    print(multiply(fibo, fibo));
  }

  public static void print(int[][] matrix) {
    for (int[] row : matrix) {
      for (int col : row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }

  public static void print(double[][] matrix) {
    for (double[] row : matrix) {
      for (double col : row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }

  public static int[][] add(int[][] matrix1, int[][] matrix2) {
    int[][] result;
    result = new int[matrix1.length][matrix1[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix1[0].length; col++) {
        result[row][col] = matrix1[row][col] + matrix2[row][col];
      }
    }
    return result;
  }

  public static double[][] add(double[][] matrix1, double[][] matrix2) {
    double[][] result;
    result = new double[matrix1.length][matrix1[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix1[0].length; col++) {
        result[row][col] = matrix1[row][col] + matrix2[row][col];
      }
    }
    return result;
  }

  public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
    int[][] result;
    result = new int[matrix1.length][matrix1[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix1[0].length; col++) {
        result[row][col] = matrix1[row][col] - matrix2[row][col];
      }
    }
    return result;
  }

  public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
    double[][] result;
    result = new double[matrix1.length][matrix1[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix1[0].length; col++) {
        result[row][col] = matrix1[row][col] - matrix2[row][col];
      }
    }
    return result;
  }

  public static int[][] multiply(int[][] matrix1, int[][] matrix2) throws IllegalArgumentException {
    if (matrix1[0].length != matrix2.length) {
      throw new IllegalArgumentException("Two matrixes cannot multiply");
    }
    int[][] result;
    result = new int[matrix1.length][matrix2[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix2.length; col++) {
        for (int k = 0; k < matrix1[0].length; k++) {
          result[row][col] = matrix1[row][k] + matrix2[k][col];
        }
      }
    }
    return result;
  }

  public static double[][] multiply(double[][] matrix1, double[][] matrix2)
      throws IllegalArgumentException {
    if (matrix1[0].length != matrix2.length) {
      throw new IllegalArgumentException("Two matrixes cannot multiply");
    }
    double[][] result;
    result = new double[matrix1.length][matrix2[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix2.length; col++) {
        for (int k = 0; k < matrix1[0].length; k++) {
          result[row][col] = matrix1[row][k] + matrix2[k][col];
        }
      }
    }
    return result;
  }
}

// 1.2
class TrigonometricSeries {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter x and num : ");
    double x = in.nextDouble();
    int num = in.nextInt();
    System.out.println(
        "The DIF betweet JDK methods Math. and the sum of sin : "
            + Math.abs(sin(x, num) - Math.sin(x)));
    System.out.println(
        "The DIF betweet JDK methods Math. and the sum of cos : "
            + Math.abs(cos(x, num) - Math.cos(x)));
    in.close();
  }

  public static double evaluate(double x, int num) {
    double result = 1;
    for (int i = 0; i < num; i++) {
      result *= x / (num - i);
    }
    return result;
  }

  public static double sin(double x, int num) {
    double result = x;
    int t = 1;
    for (int i = 3; i <= num; i += 2) {
      result += Math.pow(-1, t) * evaluate(x, i);
      t += 1;
    }
    return result;
  }

  public static double cos(double x, int num) {
    double result = 1;
    int t = 1;
    for (int i = 2; i <= num; i += 2) {
      result += Math.pow(-1, t) * evaluate(x, i);
      t += 1;
    }
    return result;
  }
}

// 1.3
class SpecialSeries {
  public static double specialSeries(double x, int numTerms) {
    double sum = x;
    for (int idx = 3; idx <= numTerms; idx += 2) {
      double fraction = isNumeratort(idx) / isDenominator(idx);
      sum += fraction * Math.pow(x, idx) / idx;
    }
    return sum;
  }

  public static double isNumeratort(int n) {
    double sum = 1.00;
    for (int idx = 1; idx < n; idx += 2) sum *= idx;
    return sum;
  }

  public static double isDenominator(int n) {
    double sum = 1.00;
    for (int idx = 2; idx < n; idx += 2) sum *= idx;
    return sum;
  }

  public static void main(String[] args) {
    double x = 2.00;
    int numTerms = 5;
    System.out.print(specialSeries(x, numTerms));
  }
}
// 1.4
class FactorialInt {
  public static void main(String[] args) {
    int factorial = 1;
    int factorialMinus1 = 1;
    int idx = 2;
    System.out.println("The factorial of 1 is 1 ");
    int max = Integer.MAX_VALUE;
    while ((max - factorialMinus1) > factorial) {
      System.out.println("The factorial of " + idx + " is " + factorial * idx);
      factorialMinus1 = factorial;
      factorial *= idx;
      idx++;
    }
    System.out.print("The factorial of " + idx + " is out of range");
  }
}

// 1.5
class FibonacciInt {
  public static void main(String[] args) {
    int fn;
    int fnMinus1 = 1;
    int fnMinus2 = 1;
    int idx = 2;
    System.out.println("F(0) = 1");
    System.out.println("F(1) = 1");
    int max = Integer.MAX_VALUE;

    while ((max - fnMinus2) > fnMinus1) {
      fn = fnMinus2;
      fnMinus2 = fnMinus2 + fnMinus1;
      fnMinus1 = fn;
      System.out.println("F(" + idx + ") = " + fnMinus2);
      idx++;
    }
    System.out.print("F(" + idx + ") is out of the range of int");
  }
}

// 1.6
class NumberConversion {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String inStr;
    int inRadix;
    int outRadix;
    System.out.print("Enter a number and a radix :");
    inStr = in.next();
    System.out.print("Enter the input radix: ");
    inRadix = in.nextInt();
    System.out.print("Enter the output radix: ");
    outRadix = in.nextInt();
    System.out.print(
        inStr
            + " inStr radix "
            + inRadix
            + " is "
            + toRadix(inStr, inRadix, outRadix)
            + " inStr radix "
            + outRadix);
    in.close();
  }

  public static String toRadix(String inStr, int inRadix, int outRadix) {
    if (inRadix == 16 && outRadix == 2) return hexToBin(inStr);
    if (inRadix == 16 && outRadix == 10) return hexToDec(inStr);

    if (inRadix == 2 && outRadix == 10) return binToDec(inStr);

    if (inRadix == 10 && outRadix == 16) return decToHex(inStr);
    if (inRadix == 10 && outRadix == 2) return decToBin(inStr);
    return "Error";
  }

  public static String hexToBin(String Hex) {
    String[] HEX_BITS = {
      "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
      "1011", "1100", "1101", "1110", "1111"
    };
    String bin = "";
    for (int idx = 0; idx < Hex.length(); idx++) {
      String s = Character.toString(Hex.charAt(idx));
      int num = Integer.parseInt(s, 16);
      bin += HEX_BITS[num];
    }
    return bin;
  }

  public static String hexToDec(String Hex) {
    int num = Integer.parseInt(Hex, 16);
    return String.valueOf(num);
  }

  public static String binToDec(String Bin) {
    int binary = Integer.parseInt(Bin);
    int i = 0;
    int decimal = 0;
    while (binary > 0) {
      if (binary % 10 != 0 && binary % 10 != 1) return "fasle";
      decimal += (binary % 10) * Math.pow(2, i);
      i++;
      binary = binary / 10;
    }
    return String.valueOf(decimal);
  }

  public static String decToHex(String Decimal) {
    int dec = Integer.parseInt(Decimal);
    String hex = Integer.toHexString(dec);
    hex = hex.toUpperCase();
    return hex;
  }

  public static String decToBin(String Decimal) {
    int Dec = Integer.parseInt(Decimal);
    int[] binary = new int[40];
    int index = 0;
    while (Dec > 0) {
      binary[index++] = Dec % 2;
      Dec = Dec / 2;
    }
    String bin = "";
    for (int i = index - 1; i >= 0; i--) bin += String.valueOf(binary[i]);
    return bin;
  }
}

// 1.7
class NumberGuess {
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

// 1.8
class WordGuess {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = "testing";
    System.out.println("java WorldGuess testing");
    int count = 0;
    int length = word.length();
    Character[] array = new Character[length];
    for (int idx = 0; idx < length; idx++) array[idx] = '_';
    while (!word.equals(stringArray(array))) {
      System.out.print("Key in one character or your guess word: ");
      String key = in.next();
      if (key.equals(word)) {
        count++;
        break;
      }
      if (key.length() > 1) continue;
      if (find(array, key.charAt(0)) == true) {
        continue;
      }
      for (int idx = 0; idx < length; idx++) {
        String c = String.valueOf(word.charAt(idx));
        if (key.equals(c)) array[idx] = c.charAt(0);
      }
      count++;
      System.out.println("Trial " + count + ": " + stringPrint(array));
    }
    System.out.println("Key in one character or your guess word: " + word);
    System.out.println("Congratulation!");
    System.out.print("You got in " + count + " trials");
    in.close();
  }

  public static String stringArray(Character[] array) {
    String word = "";
    for (int idx = 0; idx < array.length; idx++) word += array[idx];
    return word;
  }

  public static String stringPrint(Character[] array) {
    String word = "";
    for (int idx = 0; idx < array.length; idx++) word += array[idx] + " ";
    return word;
  }

  public static boolean find(Character[] array, Character key) {
    for (Character element : array) {
      if (key.equals(element)) {
        return true;
      }
    }
    return false;
  }
}

// 1.9
class DateUtil {

  public static String[] strMonths = {
    "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
  };

  public final String[] strDays = {
    "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
  };
  public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static final int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
  public static final int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

  public static boolean isLeapYear(int year) {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      return true;
    } else return false;
  }

  public static boolean isValidDate(int year, int month, int day) {
    if (year < 1 || year > 9999) {
      return false;
    }
    if (month < 1 || month > 12) {
      return false;
    }
    int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
    return 1 <= day && day <= monthDays;
  }

  public static int getDayOfWeek(int year, int month, int day) {
    int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);

    int lastTwoDigitsOfYear = year % 100;

    int magicYearNumber = lastTwoDigitsOfYear / 4;

    int magicMonthNumber =
        isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];

    int magicDayNumber = day;

    return (magicCenturyNumber
            + lastTwoDigitsOfYear
            + magicYearNumber
            + magicMonthNumber
            + magicDayNumber)
        % 7;
  }

  public void getDayOfWeekTest(int year, int month, int day) {
    Calendar cal = new GregorianCalendar(year, month - 1, day);
    int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
    String[] calendarDays = {
      "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    System.out.println("It is " + calendarDays[dayNumber - 1]);
  }

  public String toString(int year, int month, int day) {
    if (!isValidDate(year, month, day)) {
      return "Not a valid date!";
    }
    int d = getDayOfWeek(year, month, day);
    return strDays[d] + " " + day + " " + strMonths[month - 1] + " " + year;
  }

  public static void main(String[] args) {
    DateUtil aDateUtil = new DateUtil();
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2000));
    System.out.println(isLeapYear(2011));
    System.out.println(isLeapYear(2012));

    System.out.println(isValidDate(2012, 2, 29));
    System.out.println(isValidDate(2011, 2, 29));
    System.out.println(isValidDate(2099, 12, 31));
    System.out.println(isValidDate(2099, 12, 32));

    System.out.println(getDayOfWeek(1982, 4, 24));
    System.out.println(getDayOfWeek(2000, 1, 1));
    System.out.println(getDayOfWeek(2054, 6, 19));
    System.out.println(getDayOfWeek(2012, 2, 17));

    System.out.println(aDateUtil.toString(2012, 2, 14)); // Tue012
  }
}
