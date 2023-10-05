package ru.mirea.lab2.n6;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double areaCircle(double radius)
    {
        return radius*radius*Math.PI;
    }
    public double lengthCircle(double radius)
    {
        return radius*2*Math.PI;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


}
