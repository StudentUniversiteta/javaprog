package ru.mirea.lab1;

public class one
{
    public static void main(String[] args)
    {
        int num = 10; // кол-во чисел
        int[] array = new int[num];
        int sum = 0;
        for (int i=0; i<10; i++) // цикл for
        {
            array[i] = (int)(Math.random()*100); // случайное заполнение массива
            sum += array[i]; // счет суммы
        }
        System.out.print(sum / num);
    }
}
