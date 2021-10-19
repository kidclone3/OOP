import java.util.Scanner;

public class Bai4 {}
// 4.1
class PerfectNumberList {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the upper bound: ");
    int number = in.nextInt();
    in.close();
    int countPerfect = 0;
    System.out.println("These numbers are perfect : ");
    for (int idx = 1; idx <= number; idx++)
      if (isPerfect(idx)) {
        System.out.print(idx + " ");
        countPerfect++;
      }
    System.out.println();
    double percentPer = 100.00 * countPerfect / number;
    System.out.printf(" perfect numbers found :%d", countPerfect);
    System.out.printf(" (%.2f", percentPer);
    System.out.println("%)");

    int countDeficient = 0;
    System.out.println("These numbers are neither deficient nor perfect : ");
    for (int idx = 1; idx <= number; idx++)
      if (!isDeficient(idx) && !isPerfect(idx)) {
        System.out.print(idx + " ");
        countDeficient++;
      }
    System.out.println();
    double percentDef = 100.00 * countDeficient / number;
    System.out.printf(" perfect numbers found :%d", countDeficient);
    System.out.printf(" (%.2f", percentDef);
    System.out.println("%)");
  }

  public static boolean isPerfect(int aPosInt) {
    int sum = 0;
    for (int idx = 1; idx <= aPosInt / 2; idx++) if (aPosInt % idx == 0) sum += idx;
    if (sum == aPosInt) {
      return true;
    }
    return false;
  }

  public static boolean isDeficient(int aPosInt) {
    int sum = 0;
    for (int idx = 1; idx <= aPosInt / 2; idx++) if (aPosInt % idx == 0) sum += idx;
    if (sum < aPosInt) return true;
    return false;
  }
}

// 4.2

class PrimeList {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the upper bound : ");
    int number = in.nextInt();
    in.close();
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
// 4.3
class PerfectPrimeFactorList {

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

// 4.4
class Gcd {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the number a : ");
    int numbera = in.nextInt();
    System.out.print("Please enter the number b : ");
    int numberb = in.nextInt();
    System.out.println(
        gcd(numbera, numberb) + " is the greatest factor that divides both a and b ");
    in.close();
  }

  public static int gcd(int a, int b) {
    int temp;
    while (b != 0) {
      temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
