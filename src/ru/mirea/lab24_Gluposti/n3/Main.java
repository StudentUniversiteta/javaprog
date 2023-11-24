package ru.mirea.lab24_Gluposti.n3;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Text editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iCreateDocument factory = new CreateTextDocument();
        EditorWindow editorWindow = new EditorWindow(factory);

        editorWindow.createMenu(frame);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
