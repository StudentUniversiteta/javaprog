package ru.mirea.lab13_StringBuffer_StringBuilder.n6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordOrder {
    public static void main(String[] args) {
        String fileName = getInputFileName();
        String orderedLine = getLine(fileName);
        System.out.println("Ordered Line: " + orderedLine);
    }

    private static String getInputFileName() {
        //System.out.println("Введите имя файла: ");
        //Scanner in = new Scanner(System.in);
        return("C:\\Users\\artez\\Desktop\\ООП.txt");
        // Вводим имя файла с консоли и возвращаем его
    }

    private static String getLine(String fileName) {
        StringBuilder lineBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean isFirstWord = true;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");

                for (String word : words) {
                    if (isFirstWord) {
                        lineBuilder.append(word);
                        isFirstWord = false;
                    } else {
                        String lastChar = String.valueOf(lineBuilder.charAt(lineBuilder.length() - 1));
                        String firstChar = String.valueOf(word.charAt(0));

                        if (lastChar.equalsIgnoreCase(firstChar)) {
                            lineBuilder.append(" ").append(word);
                        }
                    }
                }
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lineBuilder.toString();
    }
}