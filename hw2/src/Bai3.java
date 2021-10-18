public class Bai3 {}
// 3.1
class LinearSearch {
  public static void main(String[] args) {}

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

// 3.2
class RecursiveBinarySearch {
  public static void main(String[] args) {
    //    array start at zero;
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(binarySearch(array, 15));
  }

  public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
    if (fromIdx == toIdx) {
      if (array[fromIdx] == key) {
        return true;
      } else {
        return false;
      }
    }
    int midIdx = (fromIdx + toIdx) / 2;
    if (array[midIdx] == key) {
      return true;
    }
    if (array[midIdx] > key) {
      toIdx = midIdx - 1;
    } else {
      fromIdx = midIdx + 1;
    }
    return binarySearch(array, key, fromIdx, toIdx);
  }

  public static boolean binarySearch(int[] array, int key) {
    return binarySearch(array, key, 0, array.length - 1);
  }
}

// 3.3
class BubbleSort {
  public static void main(String[] args) {
    int[] array = {1, 3, 3, 5, 1, 5, 43, 6, 7, 7, 23};
    bubbleSort(array);
    for (int element : array) {
      System.out.print(element + " ");
    }
  }

  public static void bubbleSort(int[] array) {
    //    Sort increasing array
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          int temp;
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
}

// 3.4
class SelectionSort {
  public static void main(String[] args) {}

  public static void selectionSort(int[] array) {
    for (int i = 0; i < array.length - 1; ++i) {
      //      Choose array[i] to be the smallest;
      for (int j = i + 1; j <= array.length; ++j) {
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

// 3.5
class InsertionSort {
  public static void main(String[] args) {
    int[] array = {1, 43, 23, 4, 1, 4, 6, 1};
    insertionSort(array);
    for (int element : array) {
      System.out.print(element + " ");
    }
  }

  public static void insertionSort(int[] array) {
    int[] result;
    result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      int index = 0;
      for (; index < i; ++index) {
        if (result[index] > array[i]) {
          break;
        }
      }
      insert(result, index, array[i]);
    }
    copy(array, result);
  }

  public static void copy(int[] array1, int[] array2) {
    for (int i = 0; i < array1.length; i++) {
      array1[i] = array2[i];
    }
  }

  public static void insert(int[] array, int index, int key) {
    int current;
    current = 0;
    for (int i = index; i < array.length; ++i) {
      if (i == index) {
        current = array[i];
        array[i] = key;
      } else {
        int temp;
        temp = array[i];
        array[i] = current;
        current = temp;
      }
    }
  }
}
