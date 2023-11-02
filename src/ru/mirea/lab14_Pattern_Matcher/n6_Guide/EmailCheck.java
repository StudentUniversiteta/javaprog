package ru.mirea.lab14_Pattern_Matcher.n6_Guide;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck
{
    public static void main(String[] args)
    {
        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        // \\. означает экранирование точки. Без \\ точка означала бы "любой символ".
        // ?: означает начало необязательной группы символов
        String eMail1 = "user@example";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(eMail1);
        System.out.println(matcher.matches()); //true или false


    }
}
