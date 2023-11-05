package ru.mirea.lab18_Try_Catch.n5;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key); System.out.println( message);}
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("Котята не любят null в GetDetails" );
        }
        return "data for" + key; }
    public static void main(String[] args)
    {
        ThrowsDemo n = new ThrowsDemo();
        n.getDetails(null);
    }
}
