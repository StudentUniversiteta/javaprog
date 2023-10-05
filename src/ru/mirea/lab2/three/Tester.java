package ru.mirea.lab2.three;

/**
 * Тестер для классов Circle и Point
 */
public class Tester{
    private Circle[] circles;
    private int count;

    public Tester(int maxSize) {
        circles = new Circle[maxSize];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон, невозможно добавить новый элемент.");
        }
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            Circle circle = circles[i];
            Point center = circle.getCenter();
            double radius = circle.getRadius();
            System.out.println("Окружность " + (i + 1) + ": центр (" + center.getX() + ", " + center.getY() + "), радиус " + radius);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        Point center1 = new Point(1, 1);
        Circle circle1 = new Circle(center1, 2.5);
        tester.addCircle(circle1);

        Point center2 = new Point(-2, 3);
        Circle circle2 = new Circle(center2, 4.0);
        tester.addCircle(circle2);

        tester.printCircles();
    }
}