package hw2.bai3;

import java.util.Scanner;

// 3.4
public class SelectionSort {
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
    selectionSort(array);
    System.out.println("Array after using selection sort");
    for (int element : array) {
      System.out.print(element + " ");
    }
  }

  public static void selectionSort(int[] array) {
    for (int i = 0; i < array.length - 1; ++i) {
      //      Choose array[i] to be the smallest;
      for (int j = i + 1; j < array.length; ++j) {
        if (array[j] < array[i]) {
          int temp;
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
}
