package ru.mirea.lab7_Interfaces_2.n5;

public class n5Main
{
    public static void main(String[] args)
    {
        Strings strings = new ProcessStrings("Тестирование ");
        strings.countingSymbols();
        strings.invertString();
        strings.returnOddSymbols();
    }
}
