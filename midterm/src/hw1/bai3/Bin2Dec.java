package hw1.bai3;

import java.util.Scanner;

// 3.8
public class Bin2Dec {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Binary string: ");
    String inStr = in.nextLine().toLowerCase();
    in.close();
    int answer = 0;
    System.out.println(
        "The equivalent decimal number for binary \"" + inStr + "\" is: " + bin2Dec(inStr));
  }

  public static int bin2Dec(String inStr) throws IllegalArgumentException {
    int result = 0;
    String binary = new StringBuilder(inStr).reverse().toString();
    for (int i = 0; i < binary.length(); ++i) {
      char inChar = binary.charAt(i);
      if (!Character.isDigit(inChar) || inChar > '1') {
        IllegalArgumentException notBinary =
            new IllegalArgumentException("error: invalid binary string \"" + inStr + "\"");
        throw notBinary;
      } else if (inChar == '1') {
        result += 1 << i;
      }
    }
    return result;
  }
}
