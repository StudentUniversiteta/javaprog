package ru.mirea.lab4.six;

public class TestMatrix {
    public static void main(String[] args) {
        // Создаем две матрицы
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);

        // Заполняем матрицы значениями
        matrix1.matrix[0][0] = 1;
        matrix1.matrix[0][1] = 2;
        matrix1.matrix[1][0] = 3;
        matrix1.matrix[1][1] = 4;

        matrix2.matrix[0][0] = 5;
        matrix2.matrix[0][1] = 6;
        matrix2.matrix[1][0] = 7;
        matrix2.matrix[1][1] = 8;

        // Печатаем матрицы
        System.out.println("Matrix 1:");
        matrix1.print();
        System.out.println("Matrix 2:");
        matrix2.print();

        // Складываем матрицы
        System.out.println("Sum of matrices:");
        matrix1.add(matrix2);
        matrix1.print();

        // Умножаем матрицу на число
        System.out.println("Multiplication of matrix by number:");
        matrix1.multiply(2);
        matrix1.print();

        // Умножаем матрицы
        System.out.println("Multiplication of matrices:");
        matrix1.multiply(matrix2);
        matrix1.print();
    }
}