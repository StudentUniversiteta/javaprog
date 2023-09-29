package ru.mirea.lab2.one;

public class Author {
    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }


    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Author" + "\nname: " + this.name + "\nemail: " + this.email + "\ngender: " + this.gender;
    }
}