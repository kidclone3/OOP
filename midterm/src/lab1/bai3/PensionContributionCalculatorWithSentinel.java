package lab1.bai3;

import java.util.Scanner;

// 3.4
public class PensionContributionCalculatorWithSentinel {
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
