package ru.mirea.lab2.n7;

import java.util.Scanner;

public class BookShelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        book[] mass = new book[n];
        for (int i = 0; i < n; i++) {
            mass[i] = new book();
            mass[i].setName(sc.nextLine());
            mass[i].setAuthor(sc.nextLine());
            mass[i].setDate(sc2.nextInt());
        }
        System.out.println("Хниги:");
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println((mass[i].getName()) + " ");
            System.out.println((mass[i].getAuthor()) + " ");
            System.out.println((mass[i].getDate()));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mass[i].getDate() < mass[j].getDate()) {
                    book temp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println((mass[i].getName()));
            System.out.println((mass[i].getAuthor()));
            System.out.println((mass[i].getDate()));
        }
    }
}


