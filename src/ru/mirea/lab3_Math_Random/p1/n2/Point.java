package ru.mirea.lab3_Math_Random.p1.n2;

public class Point {
    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    };
    private double x;
    private double y;
    public void setX(double x){
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY(){
        return y;
    }
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

}
