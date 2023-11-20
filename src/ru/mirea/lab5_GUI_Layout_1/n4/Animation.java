package ru.mirea.lab5_GUI_Layout_1.n4;

import javax.swing.*;
import java.awt.*;

public class Animation extends JFrame {

    private int frameNumber = -1;
    private ImageIcon[] imageIcons;

    public Animation() {
        // Загрузите изображения в массив ImageIcon
        imageIcons = new ImageIcon[2];
        imageIcons[0] = new ImageIcon("D:\\Pics\\Memes\\franzJlive.jpg");
        imageIcons[1] = new ImageIcon("D:\\Pics\\Memes\\franzJkill.jpg");
        // Создайте метку для отображения изображений
        JLabel label = new JLabel();
        add(label, BorderLayout.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        // Создайте таймер для анимации
        Timer timer = new Timer(300, e -> {
            frameNumber++;
            if (frameNumber >= imageIcons.length) {
                frameNumber = 0;
            }
            label.setIcon(imageIcons[frameNumber]);
        });
        timer.start();
        setSize(1500, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Animation().setVisible(true);
    }
}