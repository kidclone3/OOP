package hw2.bai1;

// 1.3
public class SpecialSeries {
  public static double specialSeries(double x, int numTerms) {
    double sum = x;
    for (int idx = 3; idx <= numTerms; idx += 2) {
      double fraction = isNumeratort(idx) / isDenominator(idx);
      sum += fraction * Math.pow(x, idx) / idx;
    }
    return sum;
  }

  public static double isNumeratort(int n) {
    double sum = 1.00;
    for (int idx = 1; idx < n; idx += 2) sum *= idx;
    return sum;
  }

  public static double isDenominator(int n) {
    double sum = 1.00;
    for (int idx = 2; idx < n; idx += 2) sum *= idx;
    return sum;
  }

  public static void main(String[] args) {
    double x = 2.00;
    int numTerms = 5;
    System.out.print(specialSeries(x, numTerms));
  }
}
