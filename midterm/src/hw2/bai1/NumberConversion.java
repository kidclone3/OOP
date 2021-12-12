package hw2.bai1;

import java.util.Scanner;

// 1.6
public class NumberConversion {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String inStr;
    int inRadix;
    int outRadix;
    System.out.print("Enter a number and a radix :");
    inStr = in.next();
    System.out.print("Enter the input radix: ");
    inRadix = in.nextInt();
    System.out.print("Enter the output radix: ");
    outRadix = in.nextInt();
    System.out.print(
        inStr
            + " inStr radix "
            + inRadix
            + " is "
            + toRadix(inStr, inRadix, outRadix)
            + " inStr radix "
            + outRadix);
    in.close();
  }

  public static String toRadix(String inStr, int inRadix, int outRadix) {
    if (inRadix == 16 && outRadix == 2) return hexToBin(inStr);
    if (inRadix == 16 && outRadix == 10) return hexToDec(inStr);

    if (inRadix == 2 && outRadix == 10) return binToDec(inStr);

    if (inRadix == 10 && outRadix == 16) return decToHex(inStr);
    if (inRadix == 10 && outRadix == 2) return decToBin(inStr);
    return "Error";
  }

  public static String hexToBin(String Hex) {
    String[] HEX_BITS = {
      "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
      "1011", "1100", "1101", "1110", "1111"
    };
    String bin = "";
    for (int idx = 0; idx < Hex.length(); idx++) {
      String s = Character.toString(Hex.charAt(idx));
      int num = Integer.parseInt(s, 16);
      bin += HEX_BITS[num];
    }
    return bin;
  }

  public static String hexToDec(String Hex) {
    int num = Integer.parseInt(Hex, 16);
    return String.valueOf(num);
  }

  public static String binToDec(String Bin) {
    int binary = Integer.parseInt(Bin);
    int i = 0;
    int decimal = 0;
    while (binary > 0) {
      if (binary % 10 != 0 && binary % 10 != 1) return "fasle";
      decimal += (binary % 10) * Math.pow(2, i);
      i++;
      binary = binary / 10;
    }
    return String.valueOf(decimal);
  }

  public static String decToHex(String Decimal) {
    int dec = Integer.parseInt(Decimal);
    String hex = Integer.toHexString(dec);
    hex = hex.toUpperCase();
    return hex;
  }

  public static String decToBin(String Decimal) {
    int Dec = Integer.parseInt(Decimal);
    int[] binary = new int[40];
    int index = 0;
    while (Dec > 0) {
      binary[index++] = Dec % 2;
      Dec = Dec / 2;
    }
    String bin = "";
    for (int i = index - 1; i >= 0; i--) bin += String.valueOf(binary[i]);
    return bin;
  }
}
