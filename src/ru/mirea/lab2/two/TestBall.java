package ru.mirea.lab2.two;

/**
 * Тестер для класса Ball
 */
public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1, 2);
        System.out.println(ball);
        ball.move(3, 4);
        System.out.println(ball);
    }
}