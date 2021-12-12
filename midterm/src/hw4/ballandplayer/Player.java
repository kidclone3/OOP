package hw4.ballandplayer;

// 1.7

public class Player {
  private final int number;
  private float x;
  private float y;
  private float z;

  public Player(int number, float x, float y) {
    this.number = number;
    this.x = x;
    this.y = y;
    z = 0.0f;
  }

  public void move(float xDisp, float yDisp) {
    x += xDisp;
    y += yDisp;
  }

  public void jump(float zDisp) {
    z += zDisp;
  }

  public boolean near(Ball ball) {
    return Math.abs(ball.getX() - x) < 8;
  }

  public void kick(Ball ball) {
    x = ball.getX();
    y = ball.getY();
    z = ball.getZ();
  }
}
