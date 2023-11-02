package ru.mirea.lab6_Interfaces.n1;

public class Main
{
    public static void main(String[] args)
    {
        Movable point = new MovablePoint(0, 0, 2, 4);
        point.moveDown();
        point.moveRight();
        point.moveDown();
        System.out.println(point.toString());

        Movable circle = new MovableCircle(0, 0, 33, 32, 8);
        circle.moveDown();
        circle.moveRight();
        circle.moveDown();
        System.out.println(circle.toString());
    }
}
