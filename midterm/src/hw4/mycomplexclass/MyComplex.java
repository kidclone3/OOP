package hw4.mycomplexclass;

// 1.1

public class MyComplex {

  private double real;
  private double imag;

  public MyComplex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public double getReal() {
    return this.real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImag() {
    return this.imag;
  }

  public void setImag(double imag) {
    this.imag = imag;
  }

  public void setValue(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public boolean isReal() {
    return (imag == 0);
  }

  public boolean isImaginary() {
    return (real == 0);
  }

  public boolean equals(double real, double imag) {
    return (this.real == real && this.imag == imag);
  }

  public boolean equals(MyComplex another) {
    return (this.real == another.real && this.imag == another.imag);
  }

  public double magnitude() {
    return Math.sqrt(real * real + imag * imag);
  }

  public double argumentInRadians() {
    return Math.atan2(imag, real);
  }

  public int argumentInDegrees() {
    return 0;
  }

  public MyComplex conjugate() {
    return new MyComplex(real, -imag);
  }

  public MyComplex add(MyComplex another) {
    return new MyComplex(real + another.getReal(), imag + another.getImag());
  }

  public MyComplex substract(MyComplex another) {
    return new MyComplex(real - another.getReal(), imag - another.getImag());
  }

  public MyComplex multiply(MyComplex another) {

    real = real * another.getReal() - imag * another.getImag();
    imag = real * another.getImag() + imag * another.getReal();
    return this;
  }

  public MyComplex divide(MyComplex another) {

    MyComplex tmp = multiply(another.conjugate());
    double delimiter =
        another.getReal() * another.getReal() + another.getImag() * another.getImag();
    if (delimiter != 0) {
      real = tmp.getReal() / delimiter;
      imag = tmp.getImag() / delimiter;
    }
    return this;
  }

  public String toString() {
    return "(" + real + " + " + imag + "i)";
  }
}
