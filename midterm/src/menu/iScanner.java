package menu;

import java.util.Scanner;

// This interface is written to prevent the duplicate of creating scanner method
// in all another file.
public interface iScanner {
  static Scanner scanner = new Scanner(System.in);
}
