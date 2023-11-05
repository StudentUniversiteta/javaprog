package ru.mirea.lab18_Try_Catch.n1;

public class Exception1
{
    public void exceptionDemo() {
        try {
            System.out.println();
        } catch (ArithmeticException e)
        {
            System.out.println("Attempted division by zero");
        }
    }
    public static void main (String[] args)
    {
        Exception1 check = new Exception1();
        check.exceptionDemo();
    }
}

