package mypolinomialclass;

// 1.2

public class MyPolynomial {

  private double[] coeffs;

  public MyPolynomial(double... coeffs) {
    this.coeffs = coeffs;
  }

  public double[] getCoeffs() {
    return coeffs;
  }

  public int getDegree() {
    return coeffs.length - 1;
  }

  public double evaluate(double x) {
    double sum = 0.0;
    double item = 1.0;
    for (int i = 0; i < coeffs.length; i++) {
      item *= (i == 0 ? 1.0 : x);
      sum += item * coeffs[i];
    }
    return sum;
  }

//  public MyPolynomial add(MyPolynomial another) {
//    MyPolynomial result = this;
//    if (result.getDegree() < another.getDegree()) {
//      result = another;
//      another = this;
//    }
//
//    double[] resultCoeffs = result.getCoeffs();
//    double[] anotherCoeffs = another.getCoeffs();
//    for (int i = 0; i < resultCoeffs.length; i++) {
//      if (i > anotherCoeffs.length - 1) {
//        continue;
//      }
//      resultCoeffs[i] += anotherCoeffs[i];
//    }
//    return new MyPolynomial(resultCoeffs);
//  }
public MyPolynomial add(MyPolynomial right) {
  int deg1 = this.getDegree();
  int deg2 = right.getDegree();
  double[] coeffs2 = right.getCoeffs();
  if (deg1 >= deg2) {
    for (int i = 0; i <= deg2; i++) {
      coeffs[i] += coeffs2[i];
    }
  } else {
    int degNew = deg2;
    double[] sum = new double[degNew + 1];

    for (int i = 0; i <= deg2; i++) {
      sum[i] = coeffs2[i];
    }

    for (int i = 0; i <= deg1; i++) {
      sum[i] += coeffs[i];
    }

//    this.setCoeffs(sum);
  }
  return this;
}
  public MyPolynomial multiply(MyPolynomial another) {
    double[] resultCoeffs = new double[this.getDegree() + another.getDegree() + 1];
    double[] anotherCoeffs = another.getCoeffs();
    for (int i = 0; i < resultCoeffs.length; i++) {
      double tmp = 0.0;
      for (int j = 0; j <= i; j++) {
        if (j > coeffs.length - 1) {
          continue;
        }
        if (i - j > anotherCoeffs.length - 1) {
          continue;
        }
        tmp += coeffs[j] * anotherCoeffs[i - j];
      }
      resultCoeffs[i] = tmp;
    }
    return new MyPolynomial(resultCoeffs);
  }


//  public MyPolynomial multiply(MyPolynomial right) {
//    int deg1 = this.getDegree();
//    int deg2 = right.getDegree();
//    int degNew = deg1 + deg2;
//    double[] coeffs2 = right.getCoeffs();
//    double[] mul = new double[degNew + 1];
//    for (int k = 0; k <= degNew; k++) {
//      mul[k] = 0.0;
//    }
//    for (int i = 0; i <= deg1; i++) {
//      for (int j = 0; j <= deg2; j++) {
//        mul[i + j] += coeffs[i] * coeffs2[j];
//      }
//    }
//    return new MyPolynomial(mul);
//  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int i = coeffs.length - 1; i >= 0; i--) {
      result.append(coeffs[i] + (i != 0 ? "*x^" + i + " + " : ""));
    }
    return result.toString();
  }
}
