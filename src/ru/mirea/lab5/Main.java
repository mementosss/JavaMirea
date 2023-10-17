package ru.mirea.lab5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new RandomShapes());
            frame.pack();
            frame.setVisible(true);
        });
    }
}
