import java.util.Scanner;

public class Bai2 {}
// 2.1
class Factorial {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter any number : ");
    int n = in.nextInt();
    in.close();
    System.out.print(factorial(n));
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return factorial(n - 1) * n;
    }
  }
}
// 2.2
class Fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of Fibonacci : ");
    int n = in.nextInt();
    in.close();
    System.out.println(fibonacci(n));
  }

  public static int fibonacci(int n) {
    if (n == 0) return 0;
    else if (n == 1) return 1;
    else return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
// 2.3
class LengthNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number :");
    int n = in.nextInt();
    in.close();
    System.out.println("The length number sequence is : ");
    System.out.print(length(n));
  }

  public static int numOfDigits(int n) {
    int result = 1;
    while (n >= 10) {
      n /= 10;
      result++;
    }
    return result;
  }

  public static int length(int n) {
    if (n == 1) {
      return 1;
    } else {
      return length(n - 1) + numOfDigits(n);
    }
  }
}

// 2.4
class GCD {
  public static int gcd(int a, int b) {
    if (b == 0) return a;
    else {
      return gcd(b, a % b);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number a and b: ");
    int a = in.nextInt();
    int b = in.nextInt();
    in.close();
    System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
  }
}

