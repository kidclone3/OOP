package lab2.bai1;

import java.util.Scanner;

// 1.4
public class Hex2Bin {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final String[] HEX_BITS = {
      "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
      "1011", "1100 ", "1101", "1110", "1111"
    };

    String hexadecimal;

    System.out.print("Enter the Hexadecimal string: ");
    hexadecimal = in.nextLine();
    in.close();
    System.out.print("The equivalent binary for hexadecimal \"" + hexadecimal + "\" is: ");
    for (int i = 0; i < hexadecimal.length(); i++) {
      char inChar = hexadecimal.charAt(i);
      System.out.print(HEX_BITS[convertToDecimal(inChar)] + " ");
    }
  }

  public static int convertToDecimal(char ch) {
    if (Character.isDigit(ch)) {
      return ch - '0';
    } else {
      ch = Character.toLowerCase(ch);
      return ch - 'a' + 10;
    }
  }
}
