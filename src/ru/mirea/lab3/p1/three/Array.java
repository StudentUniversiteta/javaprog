package ru.mirea.lab3.p1.three;
public class Array {
    public static void main(String[] args) {
        int[] array = new int[4];
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 90) + 10;
            System.out.print(array[j] + " ");
            if (j > 0) {
                if (array[j - 1] < array[j]) {
                    i++;
                }
            }
        }
        if (i == array.length - 1) {
            System.out.println("\nМассив является возрастающей последовательностью");
        } else {
            System.out.println("\nМассив не является возрастающей последовательностью");
        }
    }
}