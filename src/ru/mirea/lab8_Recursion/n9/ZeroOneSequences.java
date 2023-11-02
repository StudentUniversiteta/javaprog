package ru.mirea.lab8_Recursion.n9;

public class ZeroOneSequences {
    public static int countSequences(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }

        // Рекурсивно считаем количество последовательностей,
        // если первым символом будет 0 и 1 соответственно,
        // затем складываем полученные значения.
        int sequencesStartingWithZero = countSequences(a - 1, b);
        int sequencesStartingWithOne = countSequences(a, b - 1);

        return sequencesStartingWithZero + sequencesStartingWithOne;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int sequencesCount = countSequences(a, b);
        System.out.println("Количество последовательностей: " + sequencesCount);
    }
}
