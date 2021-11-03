package bai1.circle;
// 1.1
public class Circle {
  private double radius;
  private String color;

  public Circle() {
    radius = 1.0;
    color = "red";
  }

  public Circle(double radius) {
    this.radius = radius;
    color = "red";
  }

  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String toString() {
    return "bai1.Circle[radius = " + radius + " color = " + color + "]";
  }
}
