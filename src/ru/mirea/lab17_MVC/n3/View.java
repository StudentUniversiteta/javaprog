package ru.mirea.lab17_MVC.n3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class View extends JFrame{ //View
    private JTextField jtx1;
    private JTextField jtx2;
    private JTextField jtx3;
    private  JLabel layout;
    private int x;
    public View()
    {
        super("Задание 17-3");
        super.setBounds(150, 250, 300, 200);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setLayout(new BorderLayout());
        setLayout(null);
        JLabel service = new JLabel("Оклад:");
        service.setBounds(80,10,50,20);
        JLabel pas = new JLabel("Календарные дни:");
        pas.setBounds(10,35,115,20);
        JLabel user = new JLabel("Рабочие дни:");
        user.setBounds(41,60,95,20);
        jtx1 = new JTextField();
        jtx1.setBounds(140,10,130,20);
        jtx2 = new JTextField();
        jtx2.setBounds(140,35,130,20);
        jtx3 = new JTextField();
        jtx3.setBounds(140,60,130,20);
        JButton but = new JButton("Рассчитать");
        but.setBounds(100,90,100,20);
        layout = new JLabel("Result: ");
        layout.setBounds(80,120,100,20);
        super.add(service);
        super.add(pas);
        super.add(user);
        super.add(jtx1);
        super.add(jtx2);
        super.add(jtx3);
        super.add(but);
        super.add(layout);
        but.addActionListener(new retiveModel());
    }
    private class retiveModel implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int salary = Integer.parseInt(jtx1.getText());
            int calendarMonth = Integer.parseInt(jtx2.getText());
            int workingDays=Integer.parseInt(jtx3.getText());

            Model(salary,calendarMonth,workingDays);
        }
    }
    public void Model(int s, int cm,int wd)
    {
        x = s/cm*wd;
        UpdateView();
    }
    private void UpdateView()
    {
        layout.setText(layout.getText()+x);
    }

    public static void main(String[] args)
    {
        View form = new View();
        form.setVisible(true);
    }
}