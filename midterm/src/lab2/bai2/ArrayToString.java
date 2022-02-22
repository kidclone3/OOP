package lab2.bai2;

// 2.4
public class ArrayToString {
  public static void main(String[] args) {
    //        Array in main just for testing.
    int[] array = {1, 2, 3, 4, 5, 6};
    String arrayInString = arrayToString(array);
    System.out.println(arrayInString);
  }

  public static String arrayToString(int[] array) {
    String result = "";
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        result += '[';
      }
      if (i < array.length - 1) {
        result += (char) (array[i] + '0');
        result += ", ";
      } else {
        result += (char) (array[i] + '0');
        result += "]";
      }
    }
    return result;
  }
}
