package ru.mirea.lab2.n4;

/*interface pc {
    public String getName();
}*/

public class Pc
{
    private String name;
    public String getName() {
        return name;
    }

    Pc(String name) {
        this.name = name;
    }
    Pc() {
        name = "ПК не";
    }


}
