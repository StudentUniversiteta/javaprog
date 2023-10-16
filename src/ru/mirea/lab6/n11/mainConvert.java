package ru.mirea.lab6.n11;

public class mainConvert
{
    public static void main(String[] args)
    {
        Convertable kelvin = new Kelvin(2);
        kelvin.convert();
        Convertable fahrenheit = new Fahrenheit(15);
        fahrenheit.convert();
    }
}
