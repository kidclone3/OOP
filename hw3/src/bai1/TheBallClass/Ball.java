package bai1.TheBallClass;
// 1.9

public class Ball {
  private float x;
  private float y;
  private int radius;
  private float xDelta;
  private float yDelta;
  private int speed;
  private int directionInDegree;

  public Ball(float x, float y, int radius, float xDelta, float yDelta) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.xDelta = xDelta;
    this.yDelta = yDelta;
  }

  public Ball(float x, float y, int radius, int speed, int directionInDegree) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.speed = speed;
    this.directionInDegree = directionInDegree;
  }

  public void setX(float x) {
    this.x = x;
  }

  public void setY(float y) {
    this.y = y;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public void setXDelta(float xDelta) {
    this.xDelta = xDelta;
  }

  public void setYDelta(float yDelta) {
    this.yDelta = yDelta;
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }

  public int getRadius() {
    return radius;
  }

  public float getXDelta() {
    return xDelta;
  }

  public float getYDelta() {
    return yDelta;
  }

  public void move() {
    this.x += this.xDelta;
    this.y += this.yDelta;
  }

  public void reflectHorizontal() {
    this.xDelta = -this.xDelta;
  }

  public void reflectVertical() {
    this.yDelta = -this.yDelta;
  }

  public String toString() {
    return String.format("Ball[(%f, %f),speed=(%f, %f)]", x, y, xDelta, yDelta);
  }
}
