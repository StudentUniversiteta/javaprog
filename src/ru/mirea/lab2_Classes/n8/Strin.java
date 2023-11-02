package ru.mirea.lab2_Classes.n8;

public class Strin {
    public static void main(String args[]) {
        String strok[] = new String[100];
        for (int i = 0; i < strok.length; i++){
            strok[i] = "_" + i;
            System.out.print(strok[i]);
        }
        for (int i = 0; i < strok.length/2; i++){
            String temp = strok[i];
            strok[i] = strok [strok.length-1-i];
            strok[strok.length-1-i] = temp;
        }
        System.out.println("");
        for (int i = 0; i < strok.length; i++){
            System.out.print(strok[i]);
        }
    }
}
