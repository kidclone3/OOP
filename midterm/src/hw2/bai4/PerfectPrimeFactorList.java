package hw2.bai4;

import java.util.Scanner;

// 4.3
public class PerfectPrimeFactorList {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the upper bound : ");
    int number = in.nextInt();
    in.close();
    int count = 0;
    System.out.println("These numbers are equals to the product of prime factors : ");
    for (int idx = 3; idx <= number; idx++)
      if (perfectPrimeFactorList(idx)) {
        System.out.print(idx + " ");
        count++;
      }
    double percent = 100.00 * count / number;
    System.out.println();
    System.out.printf("Primes found :%d", count);
    System.out.printf(" (%.2f", percent);
    System.out.println("%)");
  }

  public static boolean perfectPrimeFactorList(int aPosInt) {
    double product = 1;
    for (int idx = 2; idx <= aPosInt / 2; idx++) {
      if (aPosInt % idx == 0 && PrimeList.isPrime(idx)) product *= idx;
    }
    if (product == aPosInt) return true;
    return false;
  }
}
