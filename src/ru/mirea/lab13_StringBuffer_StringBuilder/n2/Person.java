package ru.mirea.lab13_StringBuffer_StringBuilder.n2;

public class Person
{
    private String Name;
    private String Surname;
    private String Patronymic;
    public Person (String Name, String Surname, String Patronymic)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.Patronymic = Patronymic;
    }
    public String getFullName()
    {
        StringBuilder fullNameBuilder = new StringBuilder();
        fullNameBuilder.append(Surname);
        if (Name != null && !Name.isEmpty())
        {
            fullNameBuilder.append(" ").append(Name.charAt(0)).append(".");
        }
        if (Patronymic != null && !Patronymic.isEmpty()) {
            fullNameBuilder.append(" ").append(Patronymic.charAt(0)).append(".");
        }
        //Если имя и отчество не пустые, то добавляем их первые буквы через точку
        return fullNameBuilder.toString();
    }
}
