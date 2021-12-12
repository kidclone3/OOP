package menu;

import java.lang.reflect.Method;
import java.util.Scanner;

public class HomeWork5 {
  public static void main(String[] args) {
    while (true) {
      System.out.println("1. Exercises on Inheritance");
      System.out.println("2. Exercises on Composition vs Inheritance");
      System.out.println("3. Exercises on String and char Operations");
      System.out.println("0. Exit");
      System.out.println("Choose file to exec: ");
      Scanner scanner = new Scanner(System.in);
      int select = scanner.nextInt();
      scanner.nextLine();
      switch (select) {
        case 1:
          Bai1();
          break;
        case 2:
          Bai2();
          break;
        case 0:
          System.out.println("Bye");
          return;

        default:
          System.out.println("Please choose number in [1-2]");
          break;
      }
    }
  }

  static void runMethod(String className) {
    try {
      Class<?> tmp = Class.forName(className);
      Method method = tmp.getDeclaredMethod("main", String[].class);
      method.invoke(null, new Object[] {null});
    } catch (Throwable e) {
      System.err.println(e);
    }
  }

  public static void Bai1() {
    System.out.println("1. The Circle and Cylinder Classes");
    System.out.println("2. Superclass Person and its subclasses");
    System.out.println("3. Point2D and Point3D");
    System.out.println("4. Superclass Shape");
    System.out.println("5. Superclass Animal");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "circle.TestCylinder",
      "people.TestPerson",
      "point.TestPoint",
      "shape.TestMain",
      "animal.TestMain"
    };
    runMethod("hw5.part1." + selection[select - 1]);
  }

  public static void Bai2() {
    System.out.println("1. The Point and Line Classes");
    System.out.println("2. The Circle and Cylinder Classes Using Composition");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {"point.TestLineSub", "circle.CylinderTest"};
    runMethod("hw5.part2." + selection[select - 1]);
  }
}
