package ru.mirea.lab9.n1;
import java.util.Arrays;
public class lab9n1Test
{

        public static void main(String[] args) {
            Student[] students = {
                    new Student(123, "Alice"),
                    new Student(456, "Bob"),
                    new Student(789, "Charlie"),
                    new Student(234, "David")
            };

            System.out.println("Before sorting:");
            printStudents(students);

            insertionSortByIDNumber(students);

            System.out.println("After sorting:");
            printStudents(students);
        }

        public static void insertionSortByIDNumber(Student[] students) {
            for (int i = 1; i < students.length; i++) {
                Student key = students[i];
                int j = i - 1;

                while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                    students[j + 1] = students[j];
                    j--;
                }

                students[j + 1] = key;
            }
        }

        public static void printStudents(Student[] students) {
            for (Student student : students) {
                System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
            }
            System.out.println();
        }

}
