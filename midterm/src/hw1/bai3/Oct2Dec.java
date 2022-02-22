package hw1.bai3;

import java.util.Scanner;

// 3.11
public class Oct2Dec {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a Octal string: ");
    String inStr = in.nextLine();
//    in.close();
    System.out.println(
        "The equivalent decimal number for octal \"" + inStr + "\" is: " + oct2Dec(inStr));
  }

  public static int oct2Dec(String inStr) throws IllegalArgumentException {
    String octal = new StringBuilder(inStr.toLowerCase()).reverse().toString();
    int result = 0;
    for (int i = 0; i < octal.length(); i++) {
      char inChar = octal.charAt(i);
      if (Character.isDigit(inChar) && inChar < '8') {
        result += (int) (inChar - '0') * Math.pow(8, i);
      } else {
        IllegalArgumentException notOctal =
            new IllegalArgumentException("error: invalid octal string \"" + inStr + "\"");
        throw notOctal;
      }
    }
    return result;
  }
}
