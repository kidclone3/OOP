package menu;

import static menu.RunMethod.runMethod;

public class HomeWork4 implements iScanner, RunMethod{
  public static void main(String[] args) {
    System.out.println("1. More Exercises on Classes");
    Bai1();
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
    int select = 0;
    select = scanner.nextInt();
    String[] selection = {
      "mycomplexclass.TestMyComplex",
      "mypolinomialclass.TestMyPolynomial",
      "bigintegerclass.TestBigInteger",
      "mytimeclass.TestMyTime",
      "mydateclass.TestMyDate",
      "ballandcontainerclass.TestBall",
      "ballandplayer.TestPlayer"
    };
    runMethod("hw4." + selection[select - 1]);
  }
}
