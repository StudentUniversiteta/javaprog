package ru.mirea.lab1;
public class three
{
    public static void main(String[] args)
    {
        args = new String[]{"testing"};
        for (int i=0; i<args.length; i++)
        {
            System.out.println("args['' + i + ''] = \"" + args[i] + "\""); // вывод аргументов
        }
    }
}
