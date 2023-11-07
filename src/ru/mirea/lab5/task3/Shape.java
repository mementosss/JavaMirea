package ru.mirea.lab5.task3;

import java.awt.*;

abstract class Shape {
    private final Color color;
    private final int x;
    private final int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private final int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX() - radius, getY() - radius, 2 * radius, 2 * radius);
    }
}

class Square extends Shape {
    private final int side;

    public Square(Color color, int x, int y, int side) {
        super(color, x, y);
        this.side = side;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX() - side / 2, getY() - side / 2, side, side);
    }
}