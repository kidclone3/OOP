package hw1.bai3;

import java.util.Scanner;

// 3.12
class RadixN2Dec {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int radix;
    String inStr;

    System.out.print("Enter the radix: ");
    radix = in.nextInt();
    in.nextLine();
    if (radix > 16) {
      System.out.println("Wrong radix (must less or equal 16)");
      return;
    }

    System.out.print("Enter a string: ");
    inStr = in.nextLine();
    in.close();
    System.out.println(
        "The equivalent decimal number \"" + inStr + "\" is: " + radixN2Dec(radix, inStr));
  }

  public static int radixN2Dec(int radix, String inStr) throws IllegalArgumentException {
    int result = 0;
    String text = new StringBuilder(inStr.toLowerCase()).reverse().toString();
    for (int i = 0; i < text.length(); i++) {
      char inChar = text.charAt(i);
      int digit = convert2Dec(radix, inChar);
      if (digit == -1) {
        IllegalArgumentException wrongBase =
            new IllegalArgumentException(
                "\"error: invalid radix " + radix + " string \" + inStr + \"");
        throw wrongBase;
      } else {
        result += (int) digit * Math.pow(radix, i);
      }
    }
    return result;
  }

  public static int convert2Dec(int radix, char inChar) {
    int digit;
    if (Character.isDigit(inChar)) {
      digit = inChar - '0';
    } else {
      digit = inChar - 'a' + 10;
    }
    return digit < radix ? digit : -1;
  }
}
