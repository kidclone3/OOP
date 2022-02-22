package lab2.bai2;

// 2.6
public class Search {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(search(array, 8));
    System.out.println(search(array, 5));
  }

  public static int search(int[] array, int key) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == key) {
        return i;
      }
    }
    return -1;
  }
}
