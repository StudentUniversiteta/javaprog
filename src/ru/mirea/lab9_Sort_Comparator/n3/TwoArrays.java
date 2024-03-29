package ru.mirea.lab9_Sort_Comparator.n3;

import ru.mirea.lab9_Sort_Comparator.n1.Student;

import java.util.ArrayList;
import java.util.List;

public class TwoArrays {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(123, "Alice"));
        list1.add(new Student(456, "Bob"));
        list1.add(new Student(789, "Charlie"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(234, "David"));
        list2.add(new Student(567, "Eve"));
        list2.add(new Student(890, "Frank"));

        List<Student> mergedList = mergeSortedLists(list1, list2);

        System.out.println("Merged and sorted student list:");
        for (Student student : mergedList) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }
    }

    public static List<Student> mergeSortedLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getIDNumber() < student2.getIDNumber()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
