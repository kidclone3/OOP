package lab2.bai2;

// 2.3
public class Print {
  public static void main(String[] args) {
    //    Array in main just for testing.
    int[] arrayInt = {1, 2, 3, 4, 5, 6};
    double[] arrayDouble = {1.2, 3.4, 5.6, 7.7, 8.0};
    print(arrayInt);
    print(arrayDouble);
  }

  public static void print(double[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        System.out.print("[");
      }
      if (i < array.length - 1) {
        System.out.print(array[i] + ", ");
      } else {
        System.out.println(array[i] + "]");
      }
    }
  }

  public static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        System.out.print("[");
      }
      if (i < array.length - 1) {
        System.out.print(array[i] + ", ");
      } else {
        System.out.println(array[i] + "]");
      }
    }
  }
}
