package ru.mirea.lab8.n8;

public class palindrome
{
    private static String string;
    palindrome(String string)
    {
        this.string = string;
    }
    public int start = 0;
    public int palindromeRecursive(int n)
    {
        //if (string.length()%2==0) {
            if (start <= (string.length() / 2) && string.charAt(start) == string.charAt(string.length() - start - 1)) {
                //System.out.println("Буква " + string.charAt(start) + " совпадает с буквой " + string.charAt(string.length() - start - 1));
                start++;
            }
        //}
        if (start >= string.length()/2) {
            System.out.println("Слово " + string + " - палиндром!");
            return 1;
        }
        if (n == 1)
        {
            //System.out.println(string.length()/2);
            return 1;
        }
        return palindromeRecursive(n-1)*n;
    }
    public static void main(String[] args)
    {
        palindrome pala = new palindrome("AbcdeedcbA");
        pala.palindromeRecursive(5);
    }
}
