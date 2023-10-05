package ru.mirea.lab2.n5;

public class Dog
{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int dogToHumanAge(int age)
    {
        return age*7;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
