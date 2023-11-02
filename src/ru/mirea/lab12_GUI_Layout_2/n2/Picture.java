package ru.mirea.lab12_GUI_Layout_2.n2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Scanner;

public class Picture
{
    public static void main(String[] args) {
        //JLabel - часть GUI с выводом текста, картинки, или и того и другого

        Border border = BorderFactory.createLineBorder(Color.BLUE, 3); //создаем границы <3
        Scanner scanner = new Scanner(System.in);
        JLabel label = new JLabel(); //создаёт label
        System.out.println("Введите адрес картинки: ");
        String fileName = scanner.nextLine();
        ImageIcon image = new ImageIcon(fileName);//создаем картинку
        label.setIcon(image);//картинка
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null); //label.setBounds
        frame.setVisible(true);
        frame.add(label); //добавляем текст на фрейм, по дефолту он висит по центру слева
        //frame.setResizable(false);
        frame.pack();
    }
}
