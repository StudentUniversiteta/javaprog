package ru.mirea.lab2_Classes.n5;

public class Shelter {
    private Dog[] dogs;
    private int count;

    public Shelter(int maxSize) {
        dogs = new Dog[maxSize];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
        } else {
            System.out.println("Нет места");
        }
    }

    public void printDogs() {
        for (int i = 0; i < count; i++) {
            Dog dog = dogs[i];
            System.out.println("Собака " + (i + 1) + ": Зовут " + dog.getName() + ", " + dog.getAge() + " лет, в человеческих годах " + dog.dogToHumanAge(dog.getAge()));
        }
    }

    public static void main(String[] args) {
        Shelter shelter = new Shelter(1);
        Dog d1 = new Dog("Кошка", 12);

        shelter.addDog(d1);


        Dog d2 = new Dog("Кошка 2", 10);
        shelter.addDog(d2);

        shelter.printDogs();
    }
}
