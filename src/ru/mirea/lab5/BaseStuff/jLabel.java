package ru.mirea.lab5.BaseStuff;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class jLabel
{
    public static void main(String[] args)
    {
        //JLabel - часть GUI с выводом текста, картинки, или и того и другого

        Border border = BorderFactory.createLineBorder(Color.BLUE, 3); //создаем границы <3

        JLabel label = new JLabel(); //создаёт label
        ImageIcon image = new ImageIcon("D:\\Pics\\Memes\\изображение_2023-06-10_152159387.png");//создаем картинку
        label.setText("Проверка");//функция ввода текста
        label.setIcon(image);//картинка
        label.setHorizontalTextPosition(JLabel.CENTER); //ставим текст горизонтально относительно картинки
        label.setVerticalTextPosition(JLabel.TOP); //ставим текст вертикально относительно картинки
        label.setForeground(Color.ORANGE); //меняем цвет текста
        label.setFont(new Font("Times New Roman", Font.BOLD, 50)); //меняем шрифт и его свойства
        label.setIconTextGap(10); //расстояние между картинкой и текстом
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.black);//цвет фона (не работает??)
        label.setOpaque(true);//нужно установить на TRUE чтобы цвет фона показывался
        //label.setBounds(110, 0, 350, 350); //устанавливает x/y внутри фрейма + размеры
        label.setBorder(border); //устанавливаем границы


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null); //label.setBounds
        frame.setVisible(true);
        frame.add(label); //добавляем текст на фрейм, по дефолту он висит по центру слева
        //frame.setResizable(false);
        frame.pack();//меняет размер фрейма под компоненты, нужно использовать только после добавление всех компонентов
    }

}
