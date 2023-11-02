package ru.mirea.lab14_Pattern_Matcher.n4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LastPlusChecker
{
    private String text;
    LastPlusChecker(String text)
    {
        this.text = text;
    }
    public void Result()
    {
        String patternPlus = "\\d+(?![+])";
        Pattern pattern = Pattern.compile(patternPlus);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println("Найдено число: " + matcher.group());
        }
    }

}
