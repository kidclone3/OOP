package lab2.bai2;

// 2.10
public class Reverse {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    reverse(array);
    for (int element : array) {
      System.out.print(element + " ");
    }
  }

  public static void reverse(int[] array) {
    for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
      int temp;
      temp = array[fIdx];
      array[fIdx] = array[bIdx];
      array[bIdx] = temp;
    }
  }
}
