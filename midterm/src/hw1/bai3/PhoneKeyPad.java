package hw1.bai3;

import java.util.Scanner;

// 3.3
class PhoneKeyPad {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String inStr = in.next().toLowerCase();
//    in.close();

    PhoneKeyPadIfElse(inStr);
    PhoneKeyPadSwitchCase(inStr);
  }

  public static void PhoneKeyPadIfElse(String inStr) {
    for (int i = 0; i < inStr.length(); ++i) {
      char c = inStr.charAt(i);
      if (c == 'a' || c == 'b' || c == 'c') System.out.print(2);
      if (c == 'd' || c == 'e' || c == 'f') System.out.print(3);
      if (c == 'g' || c == 'h' || c == 'i') System.out.print(4);
      if (c == 'j' || c == 'k' || c == 'l') System.out.print(5);
      if (c == 'm' || c == 'n' || c == 'o') System.out.print(6);
      if (c == 'p' || c == 'q' || c == 'r' || c == 's') System.out.print(7);
      if (c == 't' || c == 'u' || c == 'v') System.out.print(8);
      if (c == 'w' || c == 'x' || c == 'y' || c == 'z') System.out.print(9);
    }
    System.out.println();
  }

  public static void PhoneKeyPadSwitchCase(String inStr) {
    for (int i = 0; i < inStr.length(); ++i) {
      char c = inStr.charAt(i);
      switch (c) {
        case 'a':
        case 'b':
        case 'c':
          System.out.print(2);
          break;
        case 'd':
        case 'e':
        case 'f':
          System.out.print(3);
          break;
        case 'g':
        case 'h':
        case 'i':
          System.out.print(4);
          break;
        case 'j':
        case 'k':
        case 'l':
          System.out.print(5);
          break;
        case 'm':
        case 'n':
        case 'o':
          System.out.print(6);
          break;
        case 'p':
        case 'q':
        case 'r':
        case 's':
          System.out.print(7);
          break;
        case 't':
        case 'u':
        case 'v':
          System.out.print(8);
          break;
        case 'w':
        case 'x':
        case 'y':
        case 'z':
          System.out.print(9);
          break;
      }
    }
    System.out.println();
  }
}
