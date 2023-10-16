package ru.mirea.lab5.BaseStuff;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame{
    MyJFrame()
    {
        //Можем THISнуть все frame чтобы зазеркалить их в jFrame
        this.setTitle("Мне не нравится"); //задает название окна
        this.setVisible(true); //показывает дефолтное маленькое окошко
        this.setSize(400, 400);//x | y

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //выход из приложения с закрытием окна (вместо HIDE_ON_CLOSE)
        this.setResizable(false);//меняет возможность изменения размера окна
        this.getContentPane().setBackground(new Color(120, 100, 250));//меняет цвет фона окна (поддерживает RGB, Hex, названия цветов)

        ImageIcon image = new ImageIcon("D:\\Pics\\Memes\\_t9D8ziuV0I.jpg"); //Создаёт новую иконку для окошка
        this.setIconImage(image.getImage()); //Устанавливает её
    }

}
