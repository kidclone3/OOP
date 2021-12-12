package hw1.bai3;

import java.util.Scanner;

// 3.9
public class Hex2Dec {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a Hexadecimal string: ");
    String inStr = in.nextLine();
    in.close();
    System.out.println(
        "The equivalent decimal number for hexadecimal \"" + inStr + "\" is: " + hex2Dec(inStr));
  }

  public static int hex2Dec(String inStr) throws IllegalArgumentException {
    String hexadecimal = new StringBuilder(inStr.toLowerCase()).reverse().toString();
    int result = 0;

    for (int i = 0; i < hexadecimal.length(); i++) {
      char inChar = hexadecimal.charAt(i);
      if (Character.isDigit(inChar)) {
        result += (int) (inChar - '0') * Math.pow(16, i);
      } else if (inChar <= 'f') {
        result += (int) (inChar - 'a' + 10) * Math.pow(16, i);
      } else {
        IllegalArgumentException notHexa =
            new IllegalArgumentException("error: invalid hexadecimal string \"" + inStr + "\"");
        throw notHexa;
      }
    }
    return result;
  }
}
