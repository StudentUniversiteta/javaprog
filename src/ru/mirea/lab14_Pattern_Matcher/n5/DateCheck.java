package ru.mirea.lab14_Pattern_Matcher.n5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateCheck {
    public static void main(String[] args)
    {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$";
        String date1 = "01/02/2000";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date1);
        System.out.println(matcher.matches()); //true или false
    }
}
