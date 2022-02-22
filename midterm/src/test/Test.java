package test;

import java.util.Scanner;

public class Test {
  public static String call(Scanner sc, String s) {
//    Scanner sc = new Scanner(System.in);
    String s2;
    s2 = sc.nextLine();
//    sc.close();
    return s + s2;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String select;
//    sc.close();
    while (true) {
      select = sc.nextLine();
      System.out.println(call(sc, select));
      if (select.equals("0")) break;
    }
    sc.close();
  }
}
