package ru.mirea.lab3_Math_Random.p1.n1;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class randomSort
{
    public static void main(String[] args) {

        Random randomClass = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        System.out.println("Введите минимальное значение массива: ");
        int min = scanner.nextInt();
        System.out.println("Введите максимальное значение массива: ");
        int max = scanner.nextInt();
        double[] mass = new double[n];
        for (int i = 0; i<n; i++)
        {
            mass[i] = randomClass.nextDouble(max-min)+min;
            //mass[i] = (double)(Math.random()*(max-min))
            System.out.println(mass[i]);
        }
        Arrays.sort(mass);
        System.out.println("---------------------------");
        for (int i = 0; i<n; i++)
        {
            System.out.println(mass[i]);
        }
    }
}
