package ru.mirea.lab6_Interfaces_1.n1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString()
    {
        return ("Круг сдвинулся на позицию: |"+center.getX()
                +"|"+center.getY()+"|"+"\nА ещё зачем-то дан его радиус, он равен "
                + radius);
    }
    public void moveUp() {
        center.moveUp();
    }


    public void moveDown() {
        center.moveDown();
    }


    public void moveLeft() {
        center.moveLeft();
    }


    public void moveRight() {
        center.moveRight();
    }

}
