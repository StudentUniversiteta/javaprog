package ru.mirea.lab3_Math_Random.p1.n2;

public class Circle
{
    private double R;
    private double x = 0.0, y = 0.0;
    Point centre = new Point(x, y);
    Circle(double x, double y, double R)
    {
        this.x = x;
        this.y = y;
        this.R = R;
    }
    Circle(Point point, double R)
    {
        this.R = R;
        x = point.getX();
        y = point.getY();
    }

    public double getR() {
        return R;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
