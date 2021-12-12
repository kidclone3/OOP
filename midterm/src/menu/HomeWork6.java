package menu;

import java.lang.reflect.Method;
import java.util.Scanner;

public class HomeWork6 {
  public static void main(String[] args) {
    while (true) {
      System.out.println("1. Exercises on Polymorphism, Abstract Classes and Interfaces");
      System.out.println("0. Exit");
      System.out.println("Choose file to exec: ");
      Scanner scanner = new Scanner(System.in);
      int select = scanner.nextInt();
      scanner.nextLine();
      switch (select) {
        case 1:
          Bai1();
          break;
        case 0:
          System.out.println("Bye");
          return;
        default:
          System.out.println("Please choose number in [1-1]");
          break;
      }
    }
  }

  static Scanner scanner = new Scanner(System.in);

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
    System.out.println("1. Abstract Superclass Shape and Its Concrete Subclasses");
    System.out.println("2. GeometricObject Interface");
    System.out.println("3. Movable Interface");
    System.out.println("4. Abstract Superclass Animal");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "shape.TestDriver",
      "geometricobject.TestResizableCircle",
      "movable.TestMovable",
      "anotheranimal.TestAnimal"
    };
    runMethod("hw6." + selection[select - 1]);
  }
}
