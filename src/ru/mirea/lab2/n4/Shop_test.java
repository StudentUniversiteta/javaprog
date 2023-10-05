package ru.mirea.lab2.n4;
import java.util.Scanner;
public class Shop_test {
    public static void main(String[] args) {
        Shop shop1 = new Shop();
        Scanner in = new Scanner(System.in);
        Scanner scCom = new Scanner(System.in);
        int com = -1;
        System.out.println("Введите 1 для добавления пк");
        System.out.println("Введите 2 для удаления пк");
        System.out.println("Введите 3 для поиска пк");
        System.out.println("Введите 0 для выхода");
        while (com != 0) {
            com = scCom.nextInt();
            switch (com) {
                case 1:
                    String name = in.nextLine();
                    shop1.addPc(name);
                    for (int i = 0; i < shop1.sysCount; i ++) {
                        System.out.println("pc" + (i+1) + ": " + shop1.arr[i].getName());
                    }
                    break;
                case 2:
                    shop1.delPc(in.nextLine());
                    for (int i = 0; i < shop1.sysCount; i ++) {
                        System.out.println("pc" + (i+1) + ": " + shop1.arr[i].getName());
                    }
                    break;
                case 3:
                    String s;
                    s = in.nextLine();
                    System.out.println(shop1.pcFind(s).getName() + " найден");
                    for (int i = 0; i < shop1.sysCount; i ++) {
                        System.out.println("pc" + (i+1) + ": " + shop1.arr[i].getName());
                    }
                    break;
            }
        }
    }
}
