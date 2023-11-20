package ru.mirea.lab19_Custom_Error;

public class WrongINN extends Exception {
    public WrongINN(String message) {
        super(message);
    }
}