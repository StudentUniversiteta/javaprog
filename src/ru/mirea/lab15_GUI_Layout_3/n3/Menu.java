package ru.mirea.lab15_GUI_Layout_3.n3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame {

    public Menu() {

        super("Тестовое окно");
        JMenuBar menuBar = new JMenuBar(); //создание менюбара
        JPanel panel = new JPanel();
        JMenu fileMenu = new JMenu("File"); //создание меню
        JMenuItem saveMenuFile = new JMenuItem("Save");
        JMenuItem exitMenuFile = new JMenuItem("Exit");
        JMenuItem editMenuFile = new JMenuItem("Edit");
        // Добавление пункта меню в меню
        fileMenu.add(saveMenuFile);
        fileMenu.add(exitMenuFile);
        fileMenu.add(editMenuFile);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyMenuEdit = new JMenuItem("Copy");
        JMenuItem cutMenuEdit = new JMenuItem("Cut");
        JMenuItem insertMenuEdit = new JMenuItem("Insert");
        editMenu.add(copyMenuEdit);
        editMenu.add(cutMenuEdit);
        editMenu.add(insertMenuEdit);

        JMenu helpMenu = new JMenu("Help");

        // Добавление меню в менюбар
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        // Добавление менюбара в главное окно
        setJMenuBar(menuBar);


        JButton button1 = new JButton("Button 1");
        JButton button2= new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);

        JTextField jTF1 = new JTextField();
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(panel, BorderLayout.NORTH);
        contentPane.add(jTF1, BorderLayout.SOUTH);
        setContentPane(contentPane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Comic Sans", Font.PLAIN, 18);
        Container content = getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        final JLabel label = new JLabel(" ");
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setFont(font);
        content.add(label);


        setPreferredSize(new Dimension(240, 130));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new Menu();
            }
        });
    }
}
