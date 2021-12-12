package hw2.bai3;

import java.util.Scanner;

// 3.1
public class LinearSearch {
  public static void main(String[] args) {
    int size;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter array size: ");
    size = scanner.nextInt();
    int array[] = new int[size];
    System.out.println("Enter array: ");
    for (int i = 0; i < size; i++) {
      System.out.print("Element " + i + "= ");
      array[i] = scanner.nextInt();
    }
    System.out.print("Enter searching element: ");
    int element;
    element = scanner.nextInt();
    System.out.println("Element found" + linearSearch(array, element));
    if (linearSearch(array,element)) {
      System.out.println("Element index: " + linearSearch(array, element));
    }
  }

  public static boolean linearSearch(int[] array, int key) {
    for (int element : array) {
      if (element == key) {
        return true;
      }
    }
    return false;
  }

  public static int linearSearchIndex(int[] array, int key) {
    //  If not found, return 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i] == key) {
        return i;
      }
    }
    return 0;
  }
}
