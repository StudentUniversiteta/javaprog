package ru.mirea.lab2_Classes.n7;

public class book
{
    private String author, name;
    private int date;
    public int getDate() {
        return date;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public void setName(String name1) {
        name = name1;
    }
    public void setAuthor(String name) {
        author = name;
    }
    public void setDate(int ndate) {
        date = ndate;
    }

}
