package lab1.bai3;

import java.util.Scanner;

// 3.2
public class CircleComputation {
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
