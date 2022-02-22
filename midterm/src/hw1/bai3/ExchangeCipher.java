package hw1.bai3;

import java.util.Scanner;

// 3.6
public class ExchangeCipher {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a ciphertext string: ");
    String inStr = in.nextLine().toUpperCase();
//    in.close();
    String ciphertext = "";
    for (int i = 0; i < inStr.length(); i++) {
      char inChar = inStr.charAt(i);
      int cipher = (25 - inChar + 'A') + 'A';
      ciphertext = ciphertext + (char) cipher;
    }
    System.out.println("The ciphertext string is: " + ciphertext);
  }
}
