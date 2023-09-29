package ru.mirea.lab2.two;

public class Ball {
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    double x;
    double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {}


    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}