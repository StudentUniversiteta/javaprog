package ru.mirea.lab1_Basic_Java;
import java.util.Scanner; // пакет используемый для ввода из командной строки

public class n2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int num;
        int sumW = 0;
        int sumD = 0;
        int ii = 0;
        num = in.nextInt();
        int[] arr = new int[num];
        System.out.println("Заполните массив: ");
        for (int i = 0; i<num; i++)
        {
            arr[i] = in.nextInt();
        }
        //=================WHILE=================
        System.out.println("=========РЕШЕНИЕ С ПОМОЩЬЮ WHILE==========");
        while(ii < num) //сумма
        {
            sumW+=arr[ii];
            ii++;
        }
        System.out.println("Сумма: " + sumW);
        int maxW = 0;
        int minW = Integer.MAX_VALUE;
        int ctrW = 0;
        while(ctrW < num)
        {
            if (arr[ctrW] > maxW)
            {
                maxW = arr[ctrW];
            }
            if (arr[ctrW] < minW)
            {
                minW = arr[ctrW];
            }
            ctrW++;
        }
        System.out.println("Мин. число: " + minW + "\n" + "Макс. Число: " + maxW);
        //=============DO WHILE================
        System.out.println("=========РЕШЕНИЕ С ПОМОЩЬЮ DO WHILE==========");
        ii = 0;
        do
        {
            sumD+=arr[ii];
            ii++;
        }
        while(ii < num);

        System.out.println("Сумма: " + sumD);
        int maxD = 0;
        int minD = Integer.MAX_VALUE;
        int ctrD = 0;
        do
        {
            if (arr[ctrD] > maxD)
            {
                maxD = arr[ctrD];
            }
            if (arr[ctrD] < minD)
            {
                minD = arr[ctrD];
            }
            ctrD++;
        }
        while(ctrD < num);

        System.out.println("Мин. число: " + minW + "\n" + "Макс. Число: " + maxW);
    }
}