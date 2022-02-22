package lab2.bai2;

// 2.8
public class CopyOf {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5, 6, 7};
    int[] array2 = copyOf(array1);
    for (int element : array2) {
      System.out.print(element + " ");
    }
  }

  public static int[] copyOf(int[] array) {
    int[] result;
    result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    return result;
  }
}
