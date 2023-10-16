package ru.mirea.lab3.p1.n3;
import java.util.Random;
public class Array {
    public static void main(String[] args)
    {
        int n = 4;
        int maxValue = 99;
        int minValue = 10;
        int checkerUp = 0, checkerDown = 0;
        int[] mass = new int[n];
        Random random = new Random();
        mass[0] = random.nextInt(maxValue-minValue+1) + minValue;
        System.out.println(mass[0] + " ");
        for (int i = 1; i < n; i++)
        {
            mass[i] = random.nextInt(maxValue-minValue+1) + minValue;
            if (mass[i] > mass[i-1])
            {
                checkerUp++;
            }
            else if (mass[i] < mass[i-1])
            {
                checkerDown++;
            }
            System.out.println(mass[i] + " ");
        }
        if (checkerUp == n-1)
        {
            System.out.println("Последовательность строго возрастающая! ");
        }
        else if (checkerDown == n-1)
        {
            System.out.println("Последовательность строго убывающая! ");
        }

    }
}