package ru.mirea.lab7_Interfaces_2.n4;

public class mathMain
{
    public static void main(String[] args)
    {
        MathCalculable mathFunc = new MathFunc(4);
        mathFunc.exponentiation(2);
        mathFunc.complexModule(3);
    }
}
