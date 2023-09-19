package ru.mirea.lab3;

import java.util.Scanner;

public class TestMathxRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathxRandom tasks = new MathxRandom();
        System.out.println("Choose task 1 up to 2");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> tasks.task1();
            case 2 -> tasks.task2();
        }
    }
}
