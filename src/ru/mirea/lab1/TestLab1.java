package ru.mirea.lab1;

import java.util.Scanner;

public class TestLab1 {
    public static void main (String[] args){
        Lab1 tasks = new Lab1();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> tasks.task3();
            case 2 -> tasks.task4();
            case 3 -> tasks.task5(args);

        }
    }
}
