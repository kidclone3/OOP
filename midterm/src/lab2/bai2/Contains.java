package lab2.bai2;

// 2.5
public class Contains {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5, 6};
    int[] array2 = {5, 6, 7, 8, 9, 10};
    System.out.println(contains(array1, 1));
    System.out.println(contains(array2, 1));
  }

  public static boolean contains(int[] array, int key) {
    for (int element : array) {
      if (element == key) {
        return true;
      }
    }
    return false;
  }
}
