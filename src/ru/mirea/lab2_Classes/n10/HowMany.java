package ru.mirea.lab2_Classes.n10;

import java.util.Scanner;

public class HowMany
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count = 0;
        if (name.charAt(0) != ' ') {
            count += 1;
        }
        for (int i = 0; i < name.length()-1; i ++) {
            if (name.charAt(i) == ' ' && name.charAt(i+1) != ' ') {
                count ++;
            }
        }
        System.out.println(count);
    }
}
