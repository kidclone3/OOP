package lab1.bai2;

// 2.4.1 Tribonacci
public class Tribonacci {
  public static void main(String[] args) {
    int n, nMax;
    n = 2;
    nMax = 20;
    int tn, tnMinus1, tnMinus2, tnMinus3 = 1;
    tnMinus1 = tnMinus2 = 0;
    System.out.println("T(1) = 1");
    while (n <= nMax) {
      tn = tnMinus1 + tnMinus2 + tnMinus3;
      System.out.println("T(" + n + ") = " + tn);
      tnMinus1 = tnMinus2;
      tnMinus2 = tnMinus3;
      tnMinus3 = tn;
      ++n;
    }
  }
}
