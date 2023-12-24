package ru.mirea.lab15_GUI_Layout_3.n1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonAdd = new JButton("Addition");
    JButton buttonSub = new JButton("Subtraction");
    JButton buttonMult = new JButton("Multiplication");
    JButton buttonDiv = new JButton("Divison");
    JButton buttonExp = new JButton("Exponentiation");
    Font fnt = new Font("Times new roman", Font.BOLD,20);
    Calculator()
    {
        super("Example"); //super создаёт новый, изначально невидимый фрейм с названием
        setLayout(new FlowLayout());
        setSize(400,200);
        add(new JLabel("1st Number")); //создаём первую надпись
        add(jta1); //создаём текстовое поле
        add(new JLabel("2nd Number"));
        add(jta2);
        add(buttonAdd);
        add(buttonSub);
        add(buttonMult);
        add(buttonDiv);
        add(buttonExp);
        buttonAdd.addActionListener(new ActionListener() { //добавляем кнопке проверку активности
            @Override
            public void actionPerformed(ActionEvent ae) { //добавляем реализацию выполненной активности
                try {
                    //x1 и х2 хранят вводы в свои текстовые поля
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    //всплывающее окно с информацией:
                    JOptionPane.showMessageDialog(null, "Result = "
                            + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) { //TODO
                    //всплывающее окно с ошибкой
                    JOptionPane.showMessageDialog(null, "Error in Numbers! ",
                            "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        }); //ставим в конце кнопки скобку и точку с запятой
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "
                            + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers! ",
                            "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "
                            + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers! ",
                            "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "
                            + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers! ",
                            "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonExp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "
                            + (Math.pow(x1, x2)), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers! ",
                            "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
        super.setTitle("Калькулятор"); //задает название окна
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //программа будет вырубаться при закрытии окна
    }
    public static void main(String[] args)
    {
        new Calculator();
    }

}
