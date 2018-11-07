package pongGame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

class Paddle {
    final static int WIDTH = 100;
    final static int HEIGHT = 25;
    final static int R1 = 5;
    final static int R2 = 10;
    final static int R3 = 25;


    int x, y;

    Paddle()
    {
        x = Pong.WIDTH/2;
        y = Pong.HEIGHT - Paddle.HEIGHT/2;
    }


    void draw(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(x - Paddle.WIDTH/2, y - Paddle.HEIGHT/2,
                Paddle.WIDTH, Paddle.HEIGHT);
    }


    void move(int newx)
    {
        if (newx < Paddle.WIDTH/2)
            x = Paddle.WIDTH/2;
        else if (newx > Pong.WIDTH - Paddle.WIDTH/2)
            x = Pong.WIDTH - Paddle.WIDTH/2;
        else
            x = newx;
    }
}
