package hw2.bai1;

// 1.1
public class Matrices {
  public static void main(String[] args) {
    int[][] fibo = {{1, 1}, {1, 0}};
    print(multiply(fibo, fibo));
  }

  public static void print(int[][] matrix) {
    for (int[] row : matrix) {
      for (int col : row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }

  public static void print(double[][] matrix) {
    for (double[] row : matrix) {
      for (double col : row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }

  public static int[][] add(int[][] matrix1, int[][] matrix2) {
    int[][] result;
    result = new int[matrix1.length][matrix1[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix1[0].length; col++) {
        result[row][col] = matrix1[row][col] + matrix2[row][col];
      }
    }
    return result;
  }

  public static double[][] add(double[][] matrix1, double[][] matrix2) {
    double[][] result;
    result = new double[matrix1.length][matrix1[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix1[0].length; col++) {
        result[row][col] = matrix1[row][col] + matrix2[row][col];
      }
    }
    return result;
  }

  public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
    int[][] result;
    result = new int[matrix1.length][matrix1[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix1[0].length; col++) {
        result[row][col] = matrix1[row][col] - matrix2[row][col];
      }
    }
    return result;
  }

  public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
    double[][] result;
    result = new double[matrix1.length][matrix1[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix1[0].length; col++) {
        result[row][col] = matrix1[row][col] - matrix2[row][col];
      }
    }
    return result;
  }

  public static int[][] multiply(int[][] matrix1, int[][] matrix2) throws IllegalArgumentException {
    if (matrix1[0].length != matrix2.length) {
      throw new IllegalArgumentException("Two matrixes cannot multiply");
    }
    int[][] result;
    result = new int[matrix1.length][matrix2[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix2.length; col++) {
        for (int k = 0; k < matrix1[0].length; k++) {
          result[row][col] = matrix1[row][k] + matrix2[k][col];
        }
      }
    }
    return result;
  }

  public static double[][] multiply(double[][] matrix1, double[][] matrix2)
      throws IllegalArgumentException {
    if (matrix1[0].length != matrix2.length) {
      throw new IllegalArgumentException("Two matrixes cannot multiply");
    }
    double[][] result;
    result = new double[matrix1.length][matrix2[0].length];
    for (int row = 0; row < matrix1.length; row++) {
      for (int col = 0; col < matrix2.length; col++) {
        for (int k = 0; k < matrix1[0].length; k++) {
          result[row][col] = matrix1[row][k] + matrix2[k][col];
        }
      }
    }
    return result;
  }
}

