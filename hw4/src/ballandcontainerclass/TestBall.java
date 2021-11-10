package ballandcontainerclass;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(25, 60, 20, 25, 60);

        System.out.println("The X : " + b.getX());
        System.out.println("The Y : " + b.getY());
        System.out.println("The Radius : " + b.getRadius());
        System.out.println(b);

        b.setX(30);
        b.setY(40);
        b.setRadius(50);
        System.out.println(b);

        b.move();
        System.out.println(b);

        b.reflectHorizontal();
        b.move();
        System.out.println(b);

        b.reflectVertical();
        b.move();
        System.out.println(b);
        //
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball);
        }

    }
}
