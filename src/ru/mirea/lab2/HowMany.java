package ru.mirea.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        String[] words; // массив для заполнения словами
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write words: ");
        String input = scanner.nextLine(); // считывает ввод строки
        scanner.close();
        words = input.split("\\s+"); // регулярное выражения для замены двойных или более пробелов (правильный подсёт слов)
        System.out.println(Arrays.toString(words)); // вывод содержимого массива
        System.out.print("Words cout: " + words.length);
    }
}
