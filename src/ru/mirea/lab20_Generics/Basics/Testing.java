package ru.mirea.lab20_Generics.Basics;

public class Testing
{


    public static void main(String[] args)
    {
        //HUI
        BasicGenerics<Integer> integerBasicGenerics = new BasicGenerics<>();
        integerBasicGenerics.add(42);
        int value = integerBasicGenerics.get();
        int result = integerBasicGenerics.compare(2, 10);
        System.out.println(value);
        System.out.println(result);
    }
}
