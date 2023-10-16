package ru.mirea.lab3.p3.one.n3;

public class Employee
{
    private String fullName;
    private double salary;
    Employee(double salary, String fullName)
    {
        this.salary = salary;
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
