package hw2.bai4;

import java.util.Scanner;

// 4.2
public class PrimeList {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the upper bound : ");
    int number = in.nextInt();
//    in.close();
    int count = 0;
    for (int idx = 2; idx <= number; idx++)
      if (isPrime(idx)) {
        System.out.println(idx);
        count++;
      }
    double percent = 100.00 * count / number;
    System.out.printf("Primes found :%d", count);
    System.out.printf(" (%.2f", percent);
    System.out.println("%)");
  }

  public static boolean isPrime(int n) {
    int i = 2;
    while (i <= Math.sqrt(n) && n % i != 0) i = i + 1;
    if (i > Math.sqrt(n)) return true;
    return false;
  }
}
