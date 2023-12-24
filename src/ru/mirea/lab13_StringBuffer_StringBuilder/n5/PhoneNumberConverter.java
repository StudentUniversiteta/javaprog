package ru.mirea.lab13_StringBuffer_StringBuilder.n5;

public class PhoneNumberConverter
{
    public String convertNumber(String phoneNumber)
    {
        if (phoneNumber.startsWith("+"))
        {
            String countryCode = phoneNumber.substring(1, phoneNumber.length()-10);
            String number = phoneNumber.substring(phoneNumber.length()-10);
            return "+" + countryCode + number.substring(0, 3)
                    + "-" + number.substring(3, 6) + "-" + number.substring(6);
        }
        else if (phoneNumber.startsWith("8"))
        {
            String number = phoneNumber.substring(1);
            return "+7" + number.substring(0, 3) + "-" + number.substring(3, 6)
                    + "-" + number.substring(6);
        }
        else
        {
            return "Некорректный формат номера";
        }
    }
}
