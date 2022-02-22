package hw1.bai3;

import java.util.Scanner;

// 3.5
public class DecipherCaesarCode {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a ciphertext string: ");
    String inStr = in.nextLine().toUpperCase();
//    in.close();
    int n = 3;
    String ciphertext = "";
    for (int i = 0; i < inStr.length(); i++) {
      char inChar = inStr.charAt(i);
      int cipher = (inChar - 'A' - n + 26) % 26 + 'A';
      ciphertext = ciphertext + (char) cipher;
    }
    System.out.println("The ciphertext string is: " + ciphertext);
  }
}
