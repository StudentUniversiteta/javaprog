package ru.mirea.lab6_Interfaces_1.n1;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed =  ySpeed;
    }
    public String toString()
    {
        return("Точка сдвинулась на позицию: |"+x+"|"+y+"|");
    }
    public void moveUp() {
        y+=ySpeed;
    }


    public void moveDown() {
        y-=ySpeed;
    }


    public void moveLeft() {
        x-=xSpeed;
    }


    public void moveRight() {
        x+=xSpeed;

    }
}
