package ru.mirea.lab9.n3;

public class Students {
    private int iDNumber;
    private String name;

    public Students(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }
}
