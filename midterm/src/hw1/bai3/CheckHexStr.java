package hw1.bai3;

import java.util.Scanner;

// 3.8
public class CheckHexStr {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a hex string: ");
    String inStr = in.nextLine();
    in.close();

    System.out.println(inStr + " is " + (CheckHexStr(inStr) ? "" : "NOT") + " a hex string");
  }

  public static boolean CheckHexStr(String inStr) {
    for (int i = 0; i < inStr.length(); ++i) {
      char inChar = inStr.charAt(i);
      if (!Character.isDigit(inChar)) {
        inChar = Character.toLowerCase(inChar);
        if (!Character.isLetter(inChar) || inChar > 'f') {
          return false;
        }
      }
    }
    return true;
  }
}
