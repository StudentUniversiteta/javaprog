package ru.mirea.lab2.n6;

public class CircleTest
{
    private Circle[] circles;
    private int count;
    public CircleTest ()
    {
        circles = new Circle[2];
        int count = 0;
    }
    public void newCircle(Circle circle)
    {
        if (count < 2)
        {
            circles[count] = circle;
            count++;
        }
        else
        {
            System.out.println("Уже создано два круга, уходите ");
        }
    }
    public void printCircles()
    {
        for (int i = 0; i < 2; i++)
        {
            Circle circle = circles[i];
            double radius = circle.getRadius();
            System.out.println("Окружность " + (i + 1) + ": радиус " + radius);
        }
    }
    public void compareCircles(double R1, double R2)
    {
        if (R1 == R2)
        {
            System.out.println("Равны");
        }
        else
        {
            System.out.println("Не равны");
        }
    }
    public static void main(String[] args)
    {
        CircleTest cirT = new CircleTest();
        Circle c1 = new Circle(15);
        cirT.newCircle(c1);
        Circle c2 = new Circle(15);
        cirT.newCircle(c2);
        cirT.printCircles();
        cirT.compareCircles(c1.getRadius(), c2.getRadius());
    }
}
