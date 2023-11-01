package ru.mirea.lab5;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayImage extends JFrame {
    private static final Logger LOGGER = Logger.getLogger(DisplayImage.class.getName());
    private BufferedImage image;

    public DisplayImage(String imagePath) {
        try {
            this.image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Ошибка загрузки изображения", e);
        }

        setTitle("Image demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(image.getWidth(), image.getHeight());

        JLabel label = new JLabel(new ImageIcon(image));
        add(label);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error");
            System.exit(1);
        }
        new DisplayImage(args[0]).setVisible(true);
    }
}