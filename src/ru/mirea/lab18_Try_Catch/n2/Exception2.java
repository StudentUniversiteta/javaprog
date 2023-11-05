package ru.mirea.lab18_Try_Catch.n2;
import java.util.Scanner;
public class Exception2
{
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            //int i = Integer.parseInt(intString);
            int i = Integer.valueOf(intString);
            System.out.println(2/i);
        }
        catch(NumberFormatException e)
        {
            System.err.println("Ввёл хуйню! ");
        }
    }
    public static void main(String[] args)
    {
        Exception2 check = new Exception2();
        check.exceptionDemo();
    }
}
