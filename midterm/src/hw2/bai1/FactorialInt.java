package hw2.bai1;

// 1.4
public class FactorialInt {
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
