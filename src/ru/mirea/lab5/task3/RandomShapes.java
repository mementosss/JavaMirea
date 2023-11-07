package ru.mirea.lab5.task3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private final Random random = new Random();

    private final Shape[] shapes = new Shape[NUM_SHAPES];

    public RandomShapes() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        generateRandomShapes();
    }

    private void generateRandomShapes() {
        for (int i = 0; i < NUM_SHAPES; i++) {
            Color randomColor = new Color(
                    random.nextInt(256),
                    random.nextInt(256),
                    random.nextInt(256)
            );

            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);

            int shapeType = random.nextInt(2);
            if (shapeType == 0) {
                int radius = random.nextInt(50) + 20;
                shapes[i] = new Circle(randomColor, x, y, radius);
            } else {
                int side = random.nextInt(50) + 20;
                shapes[i] = new Square(randomColor, x, y, side);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}