package ru.mirea.lab15_GUI_Layout_3.n2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class List extends JFrame {

    public List() {

        super("Тестовое окно");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Comic Sans", Font.PLAIN, 18);

        String[] items = {
                "Australia",
                "China",
                "England",
                "Russia"
        };

        Container content = getContentPane();

        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        final JLabel label = new JLabel(" ");
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setFont(font);
        content.add(label);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                label.setText(item);
            }
        };

        JComboBox comboBox = new JComboBox(items);
        comboBox.setFont(font);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        comboBox.addActionListener(actionListener);
        content.add(comboBox);

//        JComboBox editComboBox = new JComboBox(items);
//        editComboBox.setEditable(true);
//        editComboBox.setAlignmentX(LEFT_ALIGNMENT);
//        editComboBox.setFont(font);
//        editComboBox.addActionListener(actionListener);
//        content.add(editComboBox);

        setPreferredSize(new Dimension(240, 130));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new List();
            }
        });
    }
}