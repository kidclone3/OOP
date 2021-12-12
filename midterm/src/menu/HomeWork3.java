package menu;

import java.lang.reflect.Method;
import java.util.Scanner;

public class HomeWork3 {
  public static void main(String[] args) {
    System.out.println("1. Exercises on Classes");
    System.out.println("2. Exercises on Composition");
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

  static void runMethod(String methodName) {
    try {
      Class<?> tmp = Class.forName(methodName);
      Method method = tmp.getDeclaredMethod("main", String[].class);
      method.invoke(null, new Object[] {null});
    } catch (Throwable e) {
      System.err.println(e);
    }
  }

  public static void Bai1() {

    System.out.println("1. An Introduction to Classes and Instances by Example - The Circle Class");
    System.out.println("2. Another Circle Class");
    System.out.println("3. The Rectangle Class");
    System.out.println("4. The Employee Class");
    System.out.println("5. The InvoiceItem Class");
    System.out.println("6. The Account Class");
    System.out.println("7. The Date Class");
    System.out.println("8. The Time Class");
    System.out.println("9. The Ball Class");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "circle.TestCircle",
      "anothercircleclass.TestMain",
      "therectangleclass.TestRectangle",
      "theemployeeclass.TestEmployee",
      "theaccountclass.TestMain",
      "thedateclass.TestMain",
      "thetimeclass.TestMain",
      "theballclass.TestMain"
    };
    runMethod("hw3.bai1." + selection[select - 1]);
  }

  public static void Bai2() {
    System.out.println(
        "1. An Introduction to OOP Composition by Example - the Author and Book Classes");
    System.out.println(
        "2. (Advanced) The Author and Book Classes Again - An Array of Objects as an Instance Variable");
    System.out.println("3. The Author and Book Classes - Your Turn");
    System.out.println("4. The Customer and Invoice classes");
    System.out.println("5. The Customer and Account classes");
    System.out.println("6. The MyPoint Class");
    System.out.println("7. The MyLine and MyPoint Classes");
    System.out.println("8. The MyCircle and MyPoint Classes");
    System.out.println("9. The MyTriangle and MyPoint Classes");
    System.out.println("10. The MyRectangle and MyPoint Classes");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "theauthorandbookclasses.TestBook",
      "theauthorandbookclassesagain.TestBook",
      "theauthorandbookclassesyourturn.TestBook",
      "thecustomerandinvoiceclasses.TestMain",
      "thecustomerandaccountclasses.TestMain",
      "themypointclass.TestMyPoint",
      "themylineandmypointclasses.TestMyLine",
      "themycircleandmypointclasses.TestMyCircle",
      "themytriangleandmypointclasses.TestMyTriangle",
      "themyrectangleandmypointclasses.TestMyRectangle"
    };
    runMethod("hw3.bai2." + selection[select - 1]);
  }
}
