public class Bai2 {
}

//2.1
class SumAverageRunningInt{
  public static void main(String[] args) {
    int sum = 0;
    double average;
    final int LOWERBOUND = 1;
    final int UPPERBOUND = 100;

    for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
      sum += number;
    }
//    1.0 * sum to make it becomes double.
    average = 1.0 * sum / (UPPERBOUND - LOWERBOUND + 1);
    System.out.println("Sum = " + sum);
    System.out.println("Average = " + average);

//    Modify 1
    {
      sum = 0;
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
        sum += number;
        ++number;
      }
      System.out.println("\nModify 1");
      System.out.println("Modify 1, Sum = " + sum);
    }

//    Modify 2
    {
      sum = 0;
      int number = LOWERBOUND;
      do {
        sum += number;
        ++number;
      } while (number <= UPPERBOUND);
      System.out.println("\nModify 2");
      System.out.println("Modify 2, Sum = " + sum);
    }
//    3: So it is no change in result of using while - do or do - while or for loop.

//    Modify 4: Sum from 111 to 8899
    {
      int count = 0;
      sum = 0;
      for (int number = 111; number <= 8899; ++number) {
        sum += number;
        ++count;
      }
      average = 1.0 * sum / (8899 - 111 + 1);
      System.out.println("\nModify 4");
      System.out.println("Sum from 111 to 8899 = " + sum);
      System.out.println("Average = " + average);
      System.out.println("The number within the range = " + count);
    }

//    Modify 5: Sum square from 1 to 100
    {
      sum = 0;
      for (int number = 1; number <= 100; ++number) {
        sum += number * number;
      }
      System.out.println("\nModify 5");
      System.out.println("Sum of the squares = " + sum);
    }

//    Modify 6: Sum of odd numbers, even numbers
    {
      int sumOdd = 0;
      int sumEven = 0;
      int absDiff;

      for (int number = 1; number <= 100; ++number) {
        if (number % 2 == 1) {
          sumOdd += number;
        }
        else {
          sumEven += number;
        }
      }
//
      if (sumOdd > sumEven) {
        absDiff = sumOdd - sumEven;
      }
      else {
        absDiff = sumEven - sumOdd;
      }
      absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;
    }
  }
}

//2.2
class HarmonicSum {
  public static void main(String[] args) {
    final int MAX_DENOMINATOR = 50000;
    double sumL2R = 0.0;  // sum from left-to-right
    double sumR2L = 0.0;  // sum from right-to-left
    double absDiff;

//    for-loop for summing from left-to-right
    for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
      sumL2R += 1.0 / denominator;
    }
    System.out.println("The sum from left-to-right is: " + sumL2R);

//    for-loop for summing from right-to-left
    for (int denominator = MAX_DENOMINATOR; denominator >= 1; --denominator) {
      sumR2L += 1.0 / denominator;
    }
    System.out.println("The sum from right-to-left is: " + sumR2L);

    absDiff = (sumL2R > sumR2L) ? sumL2R - sumR2L : sumR2L - sumL2R;
    System.out.println("Absolute difference is: " + absDiff);
  }
}

//2.3
class ComputePI {
  public static void main(String[] args) {
    double sum = 0.0;
    int MAX_DENOMINATOR = 1000;
    for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
      if (denominator % 4 == 1) {
        sum += 1.0 / denominator;
      }
      else if (denominator % 4 == 3) {
        sum -= 1.0 / denominator;
      }
      else {
        System.out.println("Impossible!!!");
      }
    }
    System.out.println("Our PI is: " + 4 * sum);

//    Try 1:
    {
      int MAX_TERM = 10000;
      sum = 0.0;
      for (int term = 1; term <= MAX_TERM; ++term) {
        if (term % 2 == 1) {
          sum += 1.0 / (2 * term - 1);
        }
        else {
          sum -= 1.0 / (2 * term - 1);
        }
      }
      System.out.println("\nTry 1");
      System.out.println("Our PI is: " + 4 * sum);
    }

    //    Compare with the built-in PI:
    double exactPercent = 4 * sum / Math.PI * 100;
    System.out.println("Exactly percent: " + exactPercent + " %");
  }
}

//2.4
class Fibonacci {
  public static void main(String[] args) {
    int n = 3;
    int fn, fnMinus1, fnMinus2, nMax, sum;
    fnMinus1 = fnMinus2 = 1;
    nMax = 20;
    sum = fnMinus1 + fnMinus2;
    double average;

    System.out.println("The first " + nMax + " Fibonacci numbers are: ");

    while (n <= nMax) {
      fn = fnMinus1 + fnMinus2;
      sum += fn;

      ++n;
      fnMinus2 = fnMinus1;
      fnMinus1 = fn;
    }
    System.out.println(sum);
    System.out.println("Average is: " + 1.0 * sum / nMax);
  }
}

//2.4.1 Tribonacci
class Tribonacci {
  public static void main(String[] args) {
    int n, nMax;
    n = 2;
    nMax = 20;
    int tn, tnMinus1, tnMinus2, tnMinus3 = 1;
    tnMinus1 = tnMinus2 = 0;
    System.out.println("T(1) = 1");
    while (n <= nMax) {
      tn = tnMinus1 + tnMinus2 + tnMinus3;
      System.out.println("T(" + n + ") = " + tn);
      tnMinus1 = tnMinus2;
      tnMinus2 = tnMinus3;
      tnMinus3 = tn;
      ++n;
    }
  }
}

//2.4
class ExtractDigits {
  public static void main(String[] args) {
    int n = 12345;
    while (n > 0) {
      int digit = n % 10;
      System.out.print(digit + " ");
      n = n / 10;
    }
    System.out.println();
  }
}