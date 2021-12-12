package test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    long m = sc.nextLong();
    BigDecimal tmp = new BigDecimal(4 + Math.sqrt(11));
    tmp = pow(tmp, t);
    System.out.println(mod(tmp, new BigDecimal(m)));
  }
  static BigDecimal pow(BigDecimal a, long t) {
    BigDecimal ans = new BigDecimal(1);
    for(; t > 0; a = a.multiply(a), t >>= 1) {
      if(t % 2 == 0) ans = ans.multiply(a);
    }
    return ans;
  }
  static BigDecimal mod(BigDecimal a, BigDecimal m) {
    BigDecimal[] tmp = a.divideAndRemainder(m);
    System.out.println(tmp[0]);
    System.out.println(tmp[1]);
    return tmp[0];
  }
}
