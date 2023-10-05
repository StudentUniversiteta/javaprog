package ru.mirea.lab2.n1;

public class Author
{
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender)
    {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "author1{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
