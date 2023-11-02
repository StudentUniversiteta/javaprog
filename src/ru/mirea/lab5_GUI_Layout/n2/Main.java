package ru.mirea.lab5_GUI_Layout.n2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    Color color;
    int x;
    int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract void draw(Graphics g);
}

class Circle extends Shape {
    public Circle(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, 50, 50);
    }
}

class Square extends Shape {
    public Square(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, 50, 50);
    }
}

class Triangle extends Shape {
    public Triangle(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {x, x + 25, x + 50};
        int[] yPoints = {y + 50, y, y + 50};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}

public class Main extends JFrame {
    Shape[] shapes = new Shape[20];

    public Main() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Random rand = new Random();
        for (int i = 0; i < shapes.length; i++) {
            Color randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            int shapeType = rand.nextInt(3);
            if (shapeType == 0) {
                shapes[i] = new Circle(randomColor, rand.nextInt(450), rand.nextInt(450));
            } else if (shapeType == 1) {
                shapes[i] = new Square(randomColor, rand.nextInt(450), rand.nextInt(450));
            } else {
                shapes[i] = new Triangle(randomColor, rand.nextInt(450), rand.nextInt(450));
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}