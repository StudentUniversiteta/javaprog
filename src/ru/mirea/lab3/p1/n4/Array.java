package ru.mirea.lab3.p1.n4;

public class Array {

    private static int getInt() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            in.next();
        }
        return in.nextInt();
    }
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Введите размер массива: ");
            n = getInt();
        } while (n <= 0);
        int[] array = new int[n];
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n);
            System.out.print(array[i] + " ");
        }
        int[] evenArray = new int[n];
        System.out.print("\nЧетные элементы массива: ");
        int j = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) {
                evenArray[j] = array[i];
                j++;
            }
        }
        for (int i : evenArray) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }

}