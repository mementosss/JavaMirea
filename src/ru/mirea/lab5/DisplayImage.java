package ru.mirea.lab5;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DisplayImage extends JFrame {
    private BufferedImage image;

    public DisplayImage(String imagePath) {
        try {
            this.image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setTitle("Image demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(image.getWidth(), image.getHeight());

        JLabel label = new JLabel(new ImageIcon(image));
        add(label);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            new DisplayImage(args[0]).setVisible(true);
        });
    }
}