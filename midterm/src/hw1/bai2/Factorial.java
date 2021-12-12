package hw1.bai2;

public class Factorial {
  public static void main(String[] args) {
    /*  Because 20! ~ 2.43 * 1e18, while MAX_VALUE of int = 2^31-1.
    So in this problem, we have to use long.    */
    long n = 20;
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    System.out.println("The Factorial of " + n + " is " + factorial);
  }
}
