package lab2.bai2;

// 2.7
public class Equals {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5, 6};
    int[] array2 = {1, 2, 3, 4, 5, 6};
    int[] array3 = {1, 2, 4, 5, 6, 7};
    System.out.println(equals(array1, array2));
    System.out.println(equals(array1, array3));
    System.out.println(equals(array2, array3));
  }

  public static boolean equals(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] != array2[i]) {
        return false;
      }
    }
    return true;
  }
}
