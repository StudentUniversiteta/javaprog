package ru.mirea.lab3.p1.n2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Tester
{
    public static Circle[] massiv(Circle[] mass, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if (mass[i].getR() < mass[j].getR())
                {
                    Circle circle = mass[i];
                    mass[i] = mass[j];
                    mass[j] = circle;
                }
            }
        }
        return mass;
    }
    public void biggerSmaller(Circle[] mass, int n)
    {
        int bigR = 0;
        int smolR = 0;
        Circle placeHolder;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
            {
                if (mass[i].getR() > mass[j].getR())
                {
                    placeHolder = mass[i];

                }
            }

        }
    }

    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Circle[] mass = new Circle[n];
        for (int i = 0; i < n; i++)
        {
            Point point = new Point(random.nextDouble(20), random.nextDouble(20));
            Circle circle1 = new Circle(point, random.nextDouble(100));
            mass[i] = circle1;
        }
        massiv(mass, n);
        for (int i = 0; i < n; i ++) {
            System.out.println(mass[i].getX() + " " + mass[i].getY() + " " + mass[i].getR());
        }



    }
}
