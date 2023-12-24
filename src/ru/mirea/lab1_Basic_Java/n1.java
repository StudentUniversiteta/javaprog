package ru.mirea.lab1_Basic_Java;

import java.util.Scanner;

public class n1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: " + "\n");
        int num = in.nextInt(); // кол-во чисел
        int[] array = new int[num];
        int sum = 0;
        int n = 0;
        System.out.print("1 - Случайный массив, 2 - Ввод элементов" + "\n");
        while(true)
        {
            n = in.nextInt();
            if ((n == 1)||(n == 2))
                break;
            System.out.print("Неверный ввод"+"\n");
        }
        int b;
        switch (n){
            case (1):
                System.out.print("Массив: ");
                for (int i=0; i<num; i++) // цикл for
                {
                    array[i] = (int)(Math.random()*100); // случайное заполнение массива
                    sum += array[i]; // счет суммы
                    System.out.print("\n" + array[i]);
                }
                System.out.print("\n");
                break;

            case(2):
                System.out.print("Ручное заполнение массива " + "\n");
                for (int i=0; i<num; i++) // цикл for
                {
                    b = in.nextInt();
                    array[i] = b; // заполнение массива ручками
                    sum += array[i]; // счет суммы
                }
                break;
        }
        System.out.print("Итог: " + "\n" + "Среднее арифметическое - " + sum / num);
    }
}
