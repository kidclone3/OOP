package lab2.bai1;

import java.util.Scanner;

// 1.1
public class PrintArray {
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
    System.out.print("The values are: ");
    for (int i = 0; i < items.length; i++) {
      if (i == 0) {
        System.out.print("[");
      }
      if (i < items.length - 1) {
        System.out.print(items[i] + ", ");
      } else {
        System.out.print(items[i] + "]");
      }
    }
  }
}
