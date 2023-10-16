package ru.mirea.lab3.p3.one.n1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        int dollar = 96;
        int euro = 103;
        int ruble = 1;
        int choose;
        double rubleDollar = dollar / ruble;
        double rubleEuro = euro / ruble;
        // ввод из консоли
        Scanner scanner = new Scanner(System.in);

        // 1. Доллары в рубли 2. Евро в рубли 3. Рубли в доллары и евро 4. Вывод курса


        while (true) {
            System.out.println("Выберите действие:\n1. Доллары в рубли\n2. Евро в рубли\n" +
                    "3. Рубли в доллары и евро\n4. Вывод курса\n0. Выход из программы");
            choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Выход из программы");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Введите количество долларов: ");
                    dollar = scanner.nextInt();
                    System.out.printf("%d долларов = %.2f рублей%n", dollar, dollar * rubleDollar);
                    break;
                case 2:
                    System.out.print("Введите количество евро: ");
                    euro = scanner.nextInt();
                    System.out.printf("%d евро = %.2f рублей%n", euro, euro * rubleEuro);
                    break;
                case 3:
                    System.out.print("Введите количество рублей: ");
                    ruble = scanner.nextInt();
                    System.out.printf("%d рублей = %.4f долларов%n", ruble, (1 / rubleDollar) * ruble);
                    System.out.printf("%d рублей = %.4f евро%n", ruble, (1 / rubleEuro) * ruble);
                    break;
                case 4:
                    System.out.printf("1 доллар = %.2f рублей%n", rubleDollar);
                    System.out.printf("1 евро = %.2f рублей%n", rubleEuro);
                    break;
                default:
                    System.out.println("Неверный ввод");

            }
        }
    }
}