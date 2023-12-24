package ru.mirea.lab7_Interfaces_2.n5;

public class ProcessStrings implements Strings
{
    private String string = "";
    ProcessStrings(String string)
    {
        this.string = string;
    }

    public void countingSymbols() {
        System.out.println("Длина строки: "
                + string.length());
    }

    public void returnOddSymbols() {
        String empty = " ";
        for (int i = 1; i < string.length(); i+=2)
        {
            empty+=string.charAt(i);
        }
        System.out.println("Символы на нечетных позициях: " + empty);
    }

    public void invertString() {
        String toBeReversed = string;
        System.out.println("Реверснутая строка: "
                + new StringBuilder(toBeReversed).reverse());
    }
}
