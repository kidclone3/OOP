package menu;

import java.lang.reflect.Method;
import java.util.Scanner;

public class HomeWork4 {
  public static void main(String[] args) {
    System.out.println("1. More Exercises on Classes");
    Bai1();
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

    System.out.println("1. The MyComplex class");
    System.out.println("2. The MyPolynomial Class");
    System.out.println("3. Using JDK’s BigInteger Class");
    System.out.println("4. The MyTime Class");
    System.out.println("5. The MyDate Class");
    System.out.println("6. Bouncing Balls - Ball and Container Classes");
    System.out.println("7. The Ball and Player Classes");
    System.out.println("Choose file to exec: ");
    Scanner scanner = new Scanner(System.in);
    int select = scanner.nextInt();
    scanner.nextLine();
    String[] selection = {
      "mycomplexclass.TestMyComplex",
      "mypolinomialclass.TestMyPolynomial",
      "bigintegerclass.TestBigInteger",
      "mytimeclass.TestMyTime",
      "mydateclass.TestMyDate",
      "ballandcontainerclass.TestBall",
      "ballandplayer.TestPlayer"
    };
    runMethod("hw4.bai1." + selection[select - 1]);
  }
}
