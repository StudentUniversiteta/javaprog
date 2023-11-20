package ru.mirea.lab6_Interfaces_1.n11;

public class Kelvin implements Convertable {
    private double tempK;
    private double Celsius;
    public Kelvin(double Celsius)
    {
        this.Celsius = Celsius;
    }
    public void convert() {
        tempK = Celsius+273.15;
        System.out.println("Температура в кельвинах равна: " + tempK);
    }


}
