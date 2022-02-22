import javax.imageio.ImageTranscoder;
import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Bai3 {}

class SumProductMinMax3 {
  public static void main(String[] args) {
    //    SumProductMinMax3();
    SumProductMinMax5();
  }

  public static void SumProductMinMax3() {
    int number1, number2, number3;
    int sum, product, min, max;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter 1st integer: ");
    number1 = in.nextInt();
    System.out.println("Enter 2nd integer: ");
    number2 = in.nextInt();
    System.out.println("Enter 3rd integer: ");
    number3 = in.nextInt();
    in.close();
    sum = number1 + number2 + number3;
    product = number1 * number2 * number3;

    min = number1;
    if (number2 < min) {
      min = number2;
    }
    if (number3 < min) {
      min = number3;
    }
    max = number1;
    if (number2 > min) {
      max = number2;
    }
    if (number3 > min) {
      max = number3;
    }
    System.out.println("Sum = " + sum + ", Product = " + product);
    System.out.println("Min = " + min + ", Max = " + max);
    System.out.println();
  }
  //  Try 1.
  public static void SumProductMinMax5() {
    int number1, number2, number3, number4, number5;
    int sum, product, min, max;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter 1st integer: ");
    number1 = in.nextInt();
    System.out.println("Enter 2nd integer: ");
    number2 = in.nextInt();
    System.out.println("Enter 3rd integer: ");
    number3 = in.nextInt();
    System.out.println("Enter 4th integer: ");
    number4 = in.nextInt();
    System.out.println("Enter 5th integer: ");
    number5 = in.nextInt();

    in.close();

    sum = number1 + number2 + number3 + number4 + number5;
    product = number1 * number2 * number3 * number4 * number5;

    min = number1;
    if (number2 < min) {
      min = number2;
    }
    if (number3 < min) {
      min = number3;
    }
    if (number4 < min) {
      min = number4;
    }
    if (number5 < min) {
      min = number5;
    }

    max = number1;
    if (number2 > min) {
      max = number2;
    }
    if (number3 > min) {
      max = number3;
    }
    if (number4 > min) {
      max = number4;
    }
    if (number5 > min) {
      max = number5;
    }

    System.out.println("Sum = " + sum + ", Product = " + product);
    System.out.println("Min = " + min + ", Max = " + max);
  }
}

// 3.2
class CircleComputation {
  public static void main(String[] args) {
    CircleComputation();
    SphereComputation();
  }

  public static void CircleComputation() {

    System.out.println("Circle computation");
    double radius, diameter, circumference, area;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    radius = in.nextDouble();

    diameter = 2 * radius;
    circumference = Math.PI * diameter;
    area = Math.PI * radius * radius;

    System.out.printf("Diameter = %.2f\n", diameter);
    System.out.printf("Circumference = %.2f\n", circumference);
    System.out.printf("Area = %.2f\n", area);
  }
  // Try 1
  public static void SphereComputation() {

    System.out.println("Sphere computation");
    double radius, surfaceArea, volume;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    radius = in.nextDouble();

    surfaceArea = 4 * Math.PI * radius * radius;
    volume = 4.0 / 3 * Math.PI * radius * radius * radius;

    System.out.printf("Surface Area = %.2f\n", surfaceArea);
    System.out.printf("Volume = %.2f\n", volume);
  }

  public static void CylinderComputation() {

    System.out.println("Cylinder computation");
    double radius, height;
    double baseArea, surfaceArea, volume;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    radius = in.nextDouble();
    System.out.println("Enter the height: ");
    height = in.nextDouble();

    baseArea = Math.PI * radius * radius;
    surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
    volume = baseArea * height;
    System.out.printf("Base Area = %.2f\n", baseArea);
    System.out.printf("Surface Area = %.2f\n", surfaceArea);
    System.out.printf("Volume = %.2f\n", volume);
  }
}
// 3.3
class PensionContributionCalculator {
  public static void main(String[] args) {
    final int SALARY_CEILING = 6000;
    final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    final double EMPLOYEE_RATE_55_TO_60 = 0.13;
    final double EMPLOYER_RATE_55_TO_60 = 0.13;
    final double EMPLOYEE_RATE_60_TO_65 = 0.075;
    final double EMPLOYER_RATE_60_TO_65 = 0.075;
    final double EMPLOYEE_RATE_65_ABOVE = 0.05;
    final double EMPLOYER_RATE_65_ABOVE = 0.05;

    int salary, age;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the monthly salary: ");
    salary = in.nextInt();
    System.out.println("Enter the age: ");
    age = in.nextInt();

    int contributableSalary;
    double employeeContribution, employerContribution, totalContribution;

    contributableSalary = Math.min(salary, SALARY_CEILING);

    if (age <= 55) {
      employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
      employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
    } else if (age <= 60) {
      employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
      employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
    } else if (age <= 65) {
      employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
      employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
    } else {
      employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
      employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
    }
    totalContribution = employeeContribution + employerContribution;
    System.out.printf("The employee's contribution is: %.2f\n", employeeContribution);
    System.out.printf("The employer's contribution is: %.2f\n", employerContribution);
    System.out.printf("The total contribution is: %.2f\n", totalContribution);
  }
}

// 3.4
class PensionContributionCalculatorWithSentinel {
  public static void main(String[] args) {
    final int SALARY_CEILING = 6000;
    final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    final double EMPLOYEE_RATE_55_TO_60 = 0.13;
    final double EMPLOYER_RATE_55_TO_60 = 0.13;
    final double EMPLOYEE_RATE_60_TO_65 = 0.075;
    final double EMPLOYER_RATE_60_TO_65 = 0.075;
    final double EMPLOYEE_RATE_65_ABOVE = 0.05;
    final double EMPLOYER_RATE_65_ABOVE = 0.05;

    Scanner in = new Scanner(System.in);
    while (true) {
      int salary, age;
      System.out.println("Enter the monthly salary: ");
      salary = in.nextInt();
      if (salary == -1) break;
      System.out.println("Enter the age: ");
      age = in.nextInt();

      int contributableSalary;
      double employeeContribution, employerContribution, totalContribution;

      contributableSalary = Math.min(salary, SALARY_CEILING);

      if (age <= 55) {
        employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
        employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
      } else if (age <= 60) {
        employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
        employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
      } else if (age <= 65) {
        employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
        employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
      } else {
        employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
        employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
      }
      totalContribution = employeeContribution + employerContribution;
      System.out.printf("The employee's contribution is: %.2f\n", employeeContribution);
      System.out.printf("The employer's contribution is: %.2f\n", employerContribution);
      System.out.printf("The total contribution is: %.2f\n", totalContribution);
    }
  }
}

// 3.5
class ReverseInt {
  public static void main(String[] args) {
    int inNumber, inDigit;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a possitive integer: ");
    inNumber = in.nextInt();
    System.out.print("The reverse is: ");
    while (inNumber > 0) {
      inDigit = inNumber % 10;
      System.out.print(inDigit);
      inNumber /= 10;
    }
    System.out.println();
  }
}
// 3.6
class InputValidation {
  public static void main(String[] args) {
    int numberIn;

    Scanner in = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a number between 0−10 o r 90−100: ");
      numberIn = in.nextInt();
      if ((0 <= numberIn && numberIn <= 10) || (90 <= numberIn && numberIn <= 100)) {
        System.out.println("You have entered: " + numberIn);
        break;
      } else {
        System.out.println("Invalid input, try again...");
      }
    }
  }
}

// 3.7
class AverageWithInputValidation {
  public static void main(String[] args) {
    final int NUM_STUDENTS = 3;
    int numberIn;
    boolean isValid;
    int sum = 0;
    double average;
    Scanner in = new Scanner(System.in);
    for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
      isValid = false;
      do {
        System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
        numberIn = in.nextInt();
        if (0 <= numberIn && numberIn <= 100) {
          isValid = true;
        }
      } while (!isValid);
      sum += numberIn;
    }
    System.out.println("The average is: " + 1.0 * sum / NUM_STUDENTS);
  }
}
