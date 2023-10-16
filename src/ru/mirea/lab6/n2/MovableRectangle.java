package ru.mirea.lab6.n2;

import javax.swing.*;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        checkSpeed(topLeft, bottomRight);
    }
    public void checkSpeed(MovablePoint topLeft, MovablePoint bottomRight)
    {
        if ((topLeft.getxSpeed() != bottomRight.getxSpeed()) || (topLeft.getySpeed() != bottomRight.getySpeed()))
        {
            System.out.println("Скорости точек не совпадают, отмена! ");
            topLeft = new MovablePoint(topLeft.getX(), topLeft.getY(), 0, 0);
            bottomRight = new MovablePoint(bottomRight.getX(), bottomRight.getY(), 0, 0);
        }
        else {
            System.out.println("Скорости точек совпадают ");
        }
    }
    public String toString()
    {
        return ("Прямоугольник сдвинулся на позицию (По Левой верхей и правой нижней):\n|"+topLeft.getX()+"|"+topLeft.getY()+"|"+"\n|" + bottomRight.getX()+"|"+bottomRight.getY()+"|");
    }
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }


    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }


    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }


    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
