package menu;

import java.util.Scanner;
import static menu.RunMethod.runMethod;

public class HomeWork6 implements iScanner{
  public static void main(String[] args) {
      System.out.println("1. Exercises on Polymorphism, Abstract Classes and Interfaces");
      System.out.println("0. Exit");
      System.out.println("Choose file to exec: ");
      int select = 0;
      select = scanner.nextInt();
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

  public static void Bai1() {
    System.out.println("1. Abstract Superclass Shape and Its Concrete Subclasses");
    System.out.println("2. GeometricObject Interface");
    System.out.println("3. Movable Interface");
    System.out.println("4. Abstract Superclass Animal");
    System.out.println("Choose file to exec: ");
    int select = 0;
    select = scanner.nextInt();
    String[] selection = {
      "shape.TestDriver",
      "geometricobject.TestResizableCircle",
      "movable.TestMovable",
      "anotheranimal.TestAnimal"
    };
    runMethod("hw6." + selection[select - 1]);
  }
}
