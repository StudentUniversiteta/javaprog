package ru.mirea.lab6_Interfaces.n11;

public class Fahrenheit implements Convertable
{
    private double Celsius;
    private double tempF;
    Fahrenheit(double Celsius)
    {
        this.Celsius = Celsius;
    }
    public void convert() {
        tempF = Celsius*1.8+32;
        System.out.println("Температура в фаренгейтах равна: " + tempF);
    }
}
