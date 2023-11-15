package ru.mirea.TFL;

import java.util.Scanner;

public class LexicalAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для анализа:");
        String input = scanner.nextLine();

        // Разделяем строку на лексемы по границам
        String[] tokens = input.split("[\\s;()]+");

        for (String token : tokens) {
            if (token.matches("for|do")) {
                System.out.println("Ключевое слово: " + token);
            } else if (token.matches(":=")) {
                System.out.println("Знак операции присваивания: " + token);
            } else if (token.matches("[<>]|=")) {
                System.out.println("Знак операции: " + token);
            } else if (token.matches("[a-zA-Z][a-zA-Z0-9]*")) {
                System.out.println("Идентификатор: " + token);
            } else if (token.matches("-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?")) {
                System.out.println("Число: " + token);
            }
        }
    }
}


