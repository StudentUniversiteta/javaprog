package ru.mirea.lab5.BaseStuff;

public class jFrame {
    public static void main(String[] args)
    {
        //JFrame - окно GUI
        /*
        JFrame frame = new JFrame(); //создает окно
        frame.setTitle("Мне не нравится"); //задает название окна
        frame.setVisible(true); //показывает дефолтное маленькое окошко
        frame.setSize(400, 400);//x | y

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //выход из приложения с закрытием окна (вместо HIDE_ON_CLOSE)
        frame.setResizable(false);//меняет возможность изменения размера окна
        frame.getContentPane().setBackground(new Color(120, 100, 250));//меняет цвет фона окна (поддерживает RGB, Hex, названия цветов)

        ImageIcon image = new ImageIcon("D:\\Pics\\Memes\\_t9D8ziuV0I.jpg"); //Создаёт новую иконку для окошка
        frame.setIconImage(image.getImage()); //Устанавливает её

         */
        MyJFrame myFrame = new MyJFrame();
        //ИЛИ, если не будем в этом классе трогать MyJFrame:
        //new MyJFrame();
    }
}
