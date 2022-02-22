package lab2.bai2;

// 2.9
public class Swap {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5, 6};
    int[] array2 = {4, 5, 6, 7, 8, 9};
    System.out.println(swap(array1, array2));
  }

  public static boolean swap(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0; i < array1.length; i++) {
      int temp;
      temp = array1[i];
      array1[i] = array2[i];
      array2[i] = temp;
    }
    return true;
  }
}
