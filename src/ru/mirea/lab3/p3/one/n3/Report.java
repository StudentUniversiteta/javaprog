package ru.mirea.lab3.p3.one.n3;
import java.util.Scanner;
import java.util.Formatter;
public class Report
{
    public static void generateReport(Employee[] debils, int n)
    {
        for (int i = 0; i < n; i++)
        {
            Formatter formatter = new Formatter();
            System.out.println("Зарплата сотрудника " + debils[i].getFullName() + ": " + formatter.format("%16.2f", debils[i].getSalary()));
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько сотрудников в компании? ");
        int n = scanner.nextInt();
        Employee[] debils = new Employee[n];
        for (int i = 0; i < n; i++)
        {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Пожалуйста, введите имя и зарплату сотрудника");
            String nameT = scanner2.nextLine();
            double salaryT = scanner2.nextDouble();
            Employee debil = new Employee(salaryT, nameT);
            debils[i] = debil;
        }
        generateReport(debils, n);
    }
}
