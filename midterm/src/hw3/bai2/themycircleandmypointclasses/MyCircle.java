package hw3.bai2.themycircleandmypointclasses;

// 2.8

public class MyCircle {
  private MyPoint center;
  private int radius = 1;

  public MyCircle(int x, int y, int radius) {
    this.center = new MyPoint(x, y);
    this.radius = radius;
  }

  public MyCircle(MyPoint center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  public int getRadius() {
    return this.radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public MyPoint getCenter() {
    return this.center;
  }

  public void setCenter(MyPoint center) {
    this.center = center;
  }

  public int getCenterX() {
    return this.center.getX();
  }

  public int getCenterY() {
    return this.center.getY();
  }

  public void setCenterXY(int x, int y) {
    this.center.setXY(x, y);
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public String toString() {
    return "MyCircle [radius" + this.radius + " center" + this.center + "]";
  }
}
