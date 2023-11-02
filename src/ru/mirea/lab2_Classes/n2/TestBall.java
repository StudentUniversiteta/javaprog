package ru.mirea.lab2_Classes.n2;


public class TestBall {
    public static void main(String[] args)
    {
        Ball tester = new Ball(8.4, 13.2);
        System.out.println(tester);
        tester.move(8.4, 13.2);
        System.out.println(tester);
    }
}

