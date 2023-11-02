package ru.mirea.lab10_Comparator.n2n3;

public class Student
{
    private String Name;
    private String Surname;
    private String Spec;
    private int Year;
    private int Group;

    public Student(String Name, String Surname, String Spec, int Year, int Group) {
        this.Name = Name;
        this.Surname = Surname;
        this.Spec = Spec;
        this.Year = Year;
        this.Group = Group;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getSpec() {
        return Spec;
    }

    public void setSpec(String spec) {
        Spec = spec;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int group) {
        Group = group;
    }
    public String toString()
    {
        return "Студент: " + " Имя - " + Name + ", Фамилия - " + Surname + ", Специальность - " + Spec + ", Курс - " + Year + ", Группа - " + Group;
    }

}