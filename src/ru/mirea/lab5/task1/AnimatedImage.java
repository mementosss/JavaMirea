package ru.mirea.lab5.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedImage extends JPanel implements ActionListener {
    private int frameIndex; //будет отслеживать текущий индекс кадра для анимации
    private final ImageIcon[] frames; //В этом массиве будут храниться отдельные кадры анимации

    public AnimatedImage(String[] framePaths) { //конструктор класса AnimatedImage
        frames = new ImageIcon[framePaths.length]; //Массив frames инициализируется с той же длиной, что и массив framePaths
        for (int i = 0; i < framePaths.length; i++) {
            frames[i] = new ImageIcon(framePaths[i]); //создает для каждого кадра объект ImageIcon и сохраняет его в массиве frames
        }

        frameIndex = 0;

        int frameDelay = 500;
        Timer timer = new Timer(frameDelay, this); //объект Timer, который будет вызывать событие действия каждые frameDelay миллисекунд
        timer.start();
    }

    @Override //следующий метод переопределяет метод суперкласса
    public void actionPerformed(ActionEvent e) { //вызывается при возникновении события действия (в данном случае, срабатывания таймера)
        if (frameIndex < frames.length - 1) { //Если текущий frameIndex меньше общего числа кадров, индекс увеличивается; в противном случае он сбрасывается в 0
            frameIndex++;
        } else {
            frameIndex = 0;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frameIndex < frames.length) {
            ImageIcon currentFrame = frames[frameIndex];
            currentFrame.paintIcon(this, g, 0, 0); //метод paintIcon объекта currentFrame, чтобы нарисовать текущий кадр на панели (this). Аргументы 0, 0 указывают координаты начальной точки для отрисовки
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error, not enough data.");
            System.exit(1);
        }

        JFrame frame = new JFrame("Animation");
        AnimatedImage animatedImage = new AnimatedImage(args);
        frame.add(animatedImage); //Добавляется AnimatedImage в окно
        frame.setSize(animatedImage.frames[0].getIconWidth(), animatedImage.frames[0].getIconHeight());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}