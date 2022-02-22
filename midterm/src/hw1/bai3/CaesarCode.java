package hw1.bai3;

import java.util.Scanner;

// 3.4
public class CaesarCode {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a plaintext string: ");
    String inStr = in.nextLine().toUpperCase();
//    in.close();
    int n = 3;
    String ciphertext = "";
    for (int i = 0; i < inStr.length(); i++) {
      char inChar = inStr.charAt(i);
      int cipher = (inChar - 'A' + n) % 26 + 'A';
      ciphertext = ciphertext + (char) cipher;
    }
    System.out.println("The ciphertext string is: " + ciphertext);
  }
}
