package ru.mirea.lab9.n1;

public class TestStudent
{
    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = new Student[5];
        students[0] = new Student(102, "John");
        students[1] = new Student(104, "Alice");
        students[2] = new Student(101, "Bob");
        students[3] = new Student(103, "Mary");
        students[4] = new Student(105, "David");

        // Выводим неотсортированный массив
        System.out.println("Неотсортированный массив:");
        printStudents(students);

        // Сортируем массив по iDNumber с использованием сортировки вставками
        insertionSort(students);

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив:");
        printStudents(students);
    }

    // Метод сортировки вставками для массива студентов
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getiDNumber() > key.getiDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    // Метод для вывода массива студентов
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getiDNumber() + ", Имя: " + student.getName());
        }
        System.out.println();
    }
}
