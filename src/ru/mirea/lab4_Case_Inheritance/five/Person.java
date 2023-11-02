package ru.mirea.lab4_Case_Inheritance.five;


public class Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 47);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }

    String fullName;
    int age;

    // Конструктор по умолчанию
    public Person() {
        this.fullName = "";
        this.age = 0;
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод move
    public void move() {
        System.out.println(fullName + " двигается");
    }

    // Метод talk
    public void talk() {
        System.out.println(fullName + " говорит");
    }
}