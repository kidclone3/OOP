package lab2.bai1;

import java.util.Scanner;

// 1.2
public class PrintArrayInStars {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int NUM_ITEMS;
    int[] items;
    System.out.print("Enter the number of items: ");
    NUM_ITEMS = in.nextInt();
    items = new int[NUM_ITEMS];

    if (items.length > 0) {
      System.out.print("Enter the value of all items (separated by space): ");
      for (int i = 0; i < NUM_ITEMS; i++) {
        items[i] = in.nextInt();
      }
    }
    in.close();
    for (int i = 0; i < items.length; i++) {
      System.out.print(i + ": ");
      for (int starNo = 1; starNo <= items[i]; ++starNo) {
        System.out.print("*");
      }
      System.out.println("(" + items[i] + ")");
    }
  }
}
