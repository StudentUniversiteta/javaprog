package ru.mirea.lab6_Interfaces.n2;

public class Main {
    public static void main(String[] args)
    {
        /*TODO Для будущих поколений!!
        Короче, в условии написано, что нужно чекать, совпадает ли скорость движения точек прямоугольника.
        Не знаю, может их надо было двигать по отдельности? ОПЯТЬ ЖЕ в условии даётся только одна переменная
        xSpeed и ySpeed соответственно, так что тут никак отдельно ими не подвигать, но если че
        я сделал там проверку, переделай на xSpeed1 ySpeed1 и так далее, если понадобится
        */
        Movable point = new MovablePoint(0, 0, 2, 4);
        point.moveDown();
        point.moveRight();
        point.moveDown();
        System.out.println(point.toString());

        Movable rectangle = new MovableRectangle(0, 0, 4, 5, 3, 2);
        rectangle.moveLeft();
        System.out.println(rectangle.toString());
    }
}
